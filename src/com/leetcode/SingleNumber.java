/*136. Single Number
Easy

9211

322

Add to List

Share
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
Accepted
1,550,788
Submissions
2,244,472*/
package com.leetcode;

import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					temp++;
				}
			}
			if (temp == 1) {
				res = nums[i];
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(singleNumber(arr));
	}

}
