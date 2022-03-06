package com.leetcode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AddArray {

	public static List<Integer> addToArrayForm(int[] num, int k) {

		int n = num.length - 1;
		LinkedList<Integer> a = new LinkedList<Integer>();
		int sum = 0;
		int c = 0;
		for (int i = 0; i < num.length; i++) {
			sum += (num[i] * Math.pow(10, n--));
			c++;
		}
		System.out.println(c);
		int res = sum + k;
		System.out.println(res);
		while (res > 0) {
			int rem = res % 10;
			a.add(rem);
			res /= 10;
		}
		Collections.reverse(a);
		return a;
	}
	public static void main(String[] args) {
		int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int k = 1;
		System.out.println(addToArrayForm(num, k));
	}

}
