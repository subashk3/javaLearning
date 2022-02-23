/*Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.

 

Example 1:

Input: num = 33
Output: [10,11,12]
Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
Example 2:

Input: num = 4
Output: []
Explanation: There is no way to express 4 as the sum of 3 consecutive integers.*/
package com.leetcode;

import java.util.Scanner;

public class ConsecutiveIntegers {

	public long[] sumOfThree(long num) {

		// System.out.println(Long.MAX_VALUE);
		long[] a = new long[3];
		// int j=1,k=1;
		long i = (int) (num / 3);
		--i;
		System.out.println(i);
		long j = i + 1, k = i + 2;

		if (num > 4) {

			for (; i < num / 2; i++) {
				if ((i + j + k) == num) {
					a[0] = i;
					a[1] = j;
					a[2] = k;
				}
				j++;
				k++;
			}
		}

		if (a[1] > 0) {
			return a;
		} else
			return new long[0];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ConsecutiveIntegers o = new ConsecutiveIntegers();
		long a[] = o.sumOfThree(num);
		for (long x : a)
			System.out.print(x + " ");
	}

}
