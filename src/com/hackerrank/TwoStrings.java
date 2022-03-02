/*Given two strings, determine if they share a common substring. A substring may be as small as one character.


Example


These share the common substring .



These do not share a substring.

Function Description

Complete the function twoStrings in the editor below.

twoStrings has the following parameter(s):

string s1: a string
string s2: another string
Returns

string: either YES or NO
Input Format

The first line contains a single integer , the number of test cases.

The following  pairs of lines are as follows:

The first line contains string .
The second line contains string .
Constraints

 and  consist of characters in the range ascii[a-z].
Output Format

For each pair of strings, return YES or NO.

Sample Input

2
hello
world
hi
world
Sample Output

YES
NO*/
package com.hackerrank;

import java.util.Scanner;

public class TwoStrings {
	public static String twoStrings(String s1, String s2) {

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {

				if (s1.charAt(i) == s2.charAt(j)) {
					return "YES";
				}
			}

		}

		return "NO";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println(twoStrings(s1, s2));

		}

	}

}
