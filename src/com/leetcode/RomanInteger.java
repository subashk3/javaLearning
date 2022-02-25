/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

 
 https://leetcode.com/problems/roman-to-integer/*/



package com.leetcode;

import java.util.*;

public class RomanInteger {
	public int romanToInt(String s) {
		s = s.toUpperCase();
		int count = 0;
		int temp = 0;
		HashMap<Character, Integer> str = new HashMap<Character, Integer>();
		str.put('I', 1);
		str.put('V', 5);
		str.put('X', 10);
		str.put('L', 50);
		str.put('C', 100);
		str.put('D', 500);
		str.put('M', 1000);
		//System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i));
			if (str.get(s.charAt(i)) % 5 == 0 && i != 0) {
				if (i > 0) {
					temp = str.get(s.charAt(i)) - str.get(s.charAt(i - 1));
					// System.out.println(temp);
					i--;
					count += temp;
					// System.out.println(count);
				}
			} else if (i == 0)
				count += str.get(s.charAt(i));
			else
				count += str.get(s.charAt(i));
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RomanInteger o = new RomanInteger();
		String s = sc.next();
		// String s = "XX";
		sc.close();
		System.out.println(o.romanToInt(s));

	}

}
