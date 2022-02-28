package com.leetcode;

import java.util.Scanner;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;

		int len = nums.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = { 1, 2, 3, 4};
		System.out.println(containsDuplicate(nums));

	}

}
