/*3. Longest Substring Without Repeating Characters
Medium

22736

1016

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/
package com.leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> set = new HashSet<>();
		while (j < s.length()) {
			if (set.contains(s.charAt(j))) {
				set.remove(s.charAt(i));
				i++;
			} else {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the String:");
		String string = in.nextLine();
		LongestSubstring o = new LongestSubstring();
		System.out.println(o.lengthOfLongestSubstring(string));
	}

}
