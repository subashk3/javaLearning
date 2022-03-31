package demogame;

import java.util.*;

class Solution {

	public class Data {

		int numerator;

		int denominator;

		String expression;

		public Data(int n) {
			numerator = n;
			denominator = 1;
			expression = "" + n;
		}

		public Data(int n, int d, String express) {
			numerator = n;
			denominator = d;
			expression = express;
		}

		public int compareTo(Data other) {
			if (other == null)
				return 0;
			int a = numerator * other.denominator;
			int b = other.numerator * denominator;
			return a - b;
		}

		public Data minus(Data other) {
			int a = numerator * other.denominator;
			int b = other.numerator * denominator;
			int n = a - b;
			int d = denominator * other.denominator;
			return new Data(n, d, "(" + expression + ")" + "-" + "(" + other.expression + ")");
		}

		public Data add(Data other) {
			int a = numerator * other.denominator;
			int b = other.numerator * denominator;
			int n = a + b;
			int d = denominator * other.denominator;
			return new Data(n, d, "(" + expression + ")" + "+" + "(" + other.expression + ")");
		}

		public Data multiply(Data other) {
			int a = numerator * other.numerator;
			int b = other.denominator * denominator;
			return new Data(a, b, "(" + expression + ")" + "*" + "(" + other.expression + ")");
		}

		public Data divide(Data other) {
			int a = numerator * other.denominator;
			int b = other.numerator * denominator;
			if (b == 0)
				return null;
			return new Data(a, b, "(" + expression + ")" + "/" + "(" + other.expression + ")");
		}
	}

	Data target = new Data(24);

	public boolean judgePoint24(int[] nums) {
		boolean[] res = new boolean[1];
		String[] expression = new String[] { "" };
		combine(nums, 0, res, expression);
		if (res[0])
			System.out.println(expression[0]);
		return res[0];
	}

	public void combine(int[] candidates, int index, boolean[] res, String[] expression) {
		if (res[0])
			return;
		if (index == candidates.length) {
			backtrace(candidates, 0, candidates.length - 1, res, expression);
			return;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = index; i < candidates.length; i++) {
			if (set.contains(candidates[i]))
				continue;
			set.add(candidates[i]);
			swap(candidates, index, i);
			combine(candidates, index + 1, res, expression);
			swap(candidates, index, i);
		}
	}

	public void swap(int[] nums, int i, int j) {
		int tmp = nums[j];
		nums[j] = nums[i];
		nums[i] = tmp;
	}

	public List<Data> backtrace(int[] nums, int l, int r, boolean[] res, String[] expression) {
		if (res[0])
			return new ArrayList<>();
		if (l == r) {
			List<Data> list = new ArrayList<>();
			list.add(new Data(nums[l]));
			return list;
		}
		List<Data> arr = new ArrayList<>();
		for (int i = l + 1; i <= r; i++) {
			List<Data> left = backtrace(nums, l, i - 1, res, expression);
			List<Data> right = backtrace(nums, i, r, res, expression);
			for (Data d1 : left) {
				for (Data d2 : right) {
					Data res0 = d1.minus(d2);
					Data res1 = d1.add(d2);
					Data res2 = d1.multiply(d2);
					Data res3 = d1.divide(d2);
					if (l == 0 && r == nums.length - 1) {
						if (res0.compareTo(target) == 0) {
							res[0] = true;
							expression[0] = res0.expression;
						}
						if (res1.compareTo(target) == 0) {
							res[0] = true;
							expression[0] = res1.expression;
						}
						if (res2.compareTo(target) == 0) {
							res[0] = true;
							expression[0] = res2.expression;
						}
						if (res3 != null && res3.compareTo(target) == 0) {
							res[0] = true;
							expression[0] = res3.expression;
						}
						if (res[0])
							return arr;
					}
					arr.add(res0);
					arr.add(res1);
					arr.add(res2);
					if (res3 != null)
						arr.add(res3);
				}
			}
		}
		return arr;
	}
}