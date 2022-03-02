package com.leetcode;

import java.util.Scanner;

public class BinarySearch {
	public static int search(int[] nums, int target) {
		int len = nums.length;
		int start = 0;
		int end = len - 1;
		// System.out.println(len);
		while (start <= end) {
			int mid = (start + end) / 2;
			// System.out.println(mid);
			if (nums[mid] == target)
				return mid;
			if (nums[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
			// System.out.println(mid);
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();
		int target = sc.nextInt();
		System.out.println(search(nums, target));
	}
}
