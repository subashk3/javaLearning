/*Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. 
In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

Example.


aab shortens to b in one operation: remove the adjacent a characters.


Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

Function Description

Complete the superReducedString function in the editor below.

superReducedString has the following parameter(s):

string s: a string to reduce
Returns

string: the reduced string or Empty String
Input Format

A single string, .

Constraints

Sample Input 0

aaabccddd
Sample Output 0

abd
Explanation 0

Perform the following sequence of operations to get the final string:

aaabccddd → abccddd → abddd → abd
Sample Input 1

aa
Sample Output 1

Empty String
Explanation 1

aa → Empty String
Sample Input 2

baab
Sample Output 2

Empty String
Explanation 2

baab → bb → Empty String*/
package com.hackerrank;

import java.util.Scanner;

public class SuperReducedString {
	public static String superReducedString(String s) {

		String str = "";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if (count % 2 != 0) {
				String temp = Character.toString(s.charAt(i));
				if (!str.contains(temp)) {

					str += s.charAt(i);
				}
			}
		}
		if (!str.isEmpty())
			return str;
		else
			return "Empty String";
	}

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		s = sc.nextLine();
		System.out.println(superReducedString(s));

	}

}
