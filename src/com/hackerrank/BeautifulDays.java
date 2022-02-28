/*

Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor
Returns

int: the number of beautiful days in the range
Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

Sample Input

20 23 6
Sample Output

2
Explanation

Lily may go to the movies on days , , , and . We perform the following calculations to determine which days are beautiful:

Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Only two days,  and , in this interval are beautiful. Thus, we print  as our answer.
*/
package com.hackerrank;

import java.util.*;

public class BeautifulDays {

	public static int reverseNumber(int a) {
		int rem;
		int res = 0;
		while (a != 0) {
			rem = a % 10;
			res = (res * 10) + rem;
			a = a / 10;
		}

		return res;
	}

	public static int beautifulDays(int i, int j, int k) {
		// Write your code here

		int count = 0;
		for (int a = i; a <= j; a++) {
			int temp = reverseNumber(a);

			// System.out.println(a+" reververs "+ temp);
			// System.out.println((Math.abs(a - temp)));
			if ((Math.abs(a - temp)) % k == 0) {

				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(beautifulDays(i, j, k));

	}

}
