/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"*/
package com.leetcode;

import java.util.Scanner;

public class ExcelSheetIn2String {
	public static String convert(int columnNumber) {
		String round = "";
		char temp = (char) (columnNumber + 64);
		round += temp;
		return round;
	}

	public static String convertToTitle(int columnNumber) {
		String result = "";
		int rem;
		if (columnNumber <= 26) {
			result = convert(columnNumber);
		} else {
			while (columnNumber > 26) {
				String lastString;
				rem = columnNumber % 26;
				columnNumber = columnNumber / 26;
				if (rem == 0) {
					lastString = convert(26);
					columnNumber--;
				} else
					lastString = convert(rem);
				result = lastString + result;

			}
			String firstString = convert(columnNumber);
			result = firstString + result;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(convertToTitle(n));
		sc.close();
	}

}
