package com.leetcode;

import java.util.Scanner;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int len = nums.length;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		// for(int e:nums)
		// System.out.print(e+" ");
		while (j < len) {
			nums[j] = 0;
			j++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

	}

}
