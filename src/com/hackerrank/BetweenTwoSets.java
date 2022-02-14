/*There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

Example


There are two numbers between the arrays:  and .
, ,  and  for the first value.
,  and ,  for the second value. Return .

Function Description

Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.

getTotalX has the following parameter(s):

int a[n]: an array of integers
int b[m]: an array of integers
Returns

int: the number of integers that are between the sets
Input Format

The first line contains two space-separated integers,  and , the number of elements in arrays  and .
The second line contains  distinct space-separated integers  where .
The third line contains  distinct space-separated integers  where .

Constraints

Sample Input

2 3
2 4
16 32 96
Sample Output

3
Explanation

2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.*/
package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	static int findGCM(int n1, int n2) {
		int commonDiv = 1;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				commonDiv = i;
			}
		}
		return commonDiv;
	}

	static int findLCM(int n1, int n2) {

		int lcm = (n1 > n2) ? n1 : n2;

		while (true) {
			// System.out.println(lcm);
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				return lcm;
			}
			++lcm;
		}

	}

	public static int getTotalX(int[] a, int[] b) {

		// lcm
		int lcm = a[0];
		for (int sol : a) {

			lcm = findLCM(lcm, sol);

		}
		int gcm = b[0];
		for (int sol : b) {

			gcm = findGCM(gcm, sol);

		}
		int result = 0;
		int muliple = 0;
		while (muliple <= gcm) {
			muliple += lcm;

			if (gcm % muliple == 0)
				result++;

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[] a = new int[m];
		int[] b = new int[n];
		for (int i = 0; i < m; i++) {

			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(getTotalX(a, b));

	}

}
