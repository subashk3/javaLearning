/*
  Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .

Example
 

One of the arrays that can be created is . Another is . After testing all permutations, the maximum length solution array has  elements.

Function Description

Complete the nonDivisibleSubset function in the editor below.

nonDivisibleSubset has the following parameter(s):

int S[n]: an array of integers
int k: the divisor
Returns

int: the length of the longest subset of  meeting the criteria
Input Format

The first line contains  space-separated integers,  and , the number of values in  and the non factor.
The second line contains  space-separated integers, each an , the unique values of the set.

Constraints

All of the given numbers are distinct.
Sample Input

STDIN    Function
-----    --------
4 3      S[] size n = 4, k = 3
1 7 2 4  S = [1, 7, 2, 4]
Sample Output

3
Explanation

The sums of all permutations of two elements from  are:

1 + 7 = 8
1 + 2 = 3
1 + 4 = 5
7 + 2 = 9
7 + 4 = 11
2 + 4 = 6
Only  will not ever sum to a multiple of .
https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true
4 3
1 7 2 4
*/
package com.hackerrank;

import java.util.*;

public class NonDivisibleSubset {

	public static int nonDivisibleSubset(int k, int[] s) {

		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				int temp = s[i] + s[j];
				//System.out.println(s[i] +" + "+ s[j]);
				if (temp % k == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] s = new int[n];

		for (int i = 0; i < n; i++) {

			s[i] = sc.nextInt();
		}
		System.out.println(nonDivisibleSubset(k, s));
	}

}
