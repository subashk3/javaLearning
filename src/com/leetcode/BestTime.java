package com.leetcode;

public class BestTime {
	public static int maxProfit(int[] prices) {

		// int profit = 0;
		int max = 0;
		int i = 0;
		int min =prices[0];
		for (int a = 1; a < prices.length; a++) {
			if (prices[a] < min) {
				min = prices[a];
				i=a;
			}
		}
		//System.out.println(i);
		int j = i + 1;
		while (j < prices.length) {
			int temp = prices[j] - prices[i];
		//	System.out.print(temp);
			if (max < temp) {
				max = temp;
			}
			j++;
		}

		if (max > 0) {
			return max;
		} else if (max < 0) {
			max = 0;
		}
		return max;

	}
	public static void main(String[] args) {

		int[] a = { 7, 6, 5, 3, 1, 4 };

		System.out.println(maxProfit(a));

	}

}
