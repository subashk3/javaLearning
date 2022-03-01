/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 

Constraints:

0 <= num <= 231 - 1*/


package com.leetcode;

import java.util.Scanner;

public class AddDigits {
	public static int addDigits(int num) {
		int n = num;
		int rem;
		while (n > 9) {
			rem = n % 10;
			n = n / 10;
			n += rem;
		//	System.out.println(n);
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(addDigits(n));

	}

}
