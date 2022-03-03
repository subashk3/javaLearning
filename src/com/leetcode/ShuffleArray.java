package com.leetcode;

import java.util.Scanner;

public class ShuffleArray {

	public static int[] shuffle(int[] nums, int n) {

		int ans[] = new int[2 * n];

		int j = 0;
		
		for (int i = 0; i < n; i++) {
		
			ans[i] = nums[i];
			
			ans[j + 2] = nums[i + n];
		}

		for (int z : ans)
			System.out.print(z + " ");

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		for (int x : nums)
			System.out.print(x + " ");
		System.out.println();
		System.out.println();
		shuffle(nums, n);

	}

}
