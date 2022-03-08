/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/
package com.leetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		HashMap<Character, Character> temp = new HashMap<Character, Character>();
		temp.put('(', ')');
		temp.put('[', ']');
		temp.put('{', '}');
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char p = s.charAt(i);
			if (temp.keySet().contains(p)) {
				st.push(p);
			} else if (temp.values().contains(p)) {
				if (!st.empty() && temp.get(st.peek()) == p) {
					st.pop();
				} else {
					return false;
				}
			}
		}

		return st.empty();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(isValid(s));

	}

}
