/*70. Climbing Stairs
Easy

10611

328

Add to List

Share
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45*/
package com.leetcode;

import java.util.Scanner;

public class ClimbingStairs {
	public static int climbStairs(int n) {
		int x = 1, y = 0, res = 0;
		for (int i = 1; i <= n + 1; i++) {
			res = x + y;
			x = y;
			y = res;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(climbStairs(n));

	}

}
