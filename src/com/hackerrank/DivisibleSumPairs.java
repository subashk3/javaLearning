/*Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

Constraints

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5
 link :https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
package com.hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, int[] a) {
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			int sum = 0;
			for (int j = i + 1; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum % k == 0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println(divisibleSumPairs(n, k, a));

	}

}
