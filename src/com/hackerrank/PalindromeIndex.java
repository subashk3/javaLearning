package com.hackerrank;

import java.util.Scanner;

public class PalindromeIndex {
	/*
	 * public static int palindromeIndex(String s) { StringBuffer str = new
	 * StringBuffer(s); StringBuffer temp = new StringBuffer(); int res = 0; if
	 * (str.reverse().toString().equals(s)) return -1; str.reverse();
	 * System.out.println(str.substring(2));;
	 * 
	 * System.out.println(str);
	 * 
	 * for (int i = 0; i < str.length(); i++) { temp = str.deleteCharAt(i);
	 * 
	 * if (temp.reverse().toString().equals(str)) {
	 * 
	 * res = i; }
	 * 
	 * } return res; }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s;
		while (t-- > 0) {
			s = sc.next();
			System.out.println(palindromeIndex1(s));

		}
	}

	static int palindromeIndex1(String s) {
		StringBuffer str = new StringBuffer(s);
		int size = s.length();
		int res = -1;
		String empty = "";
		str.reverse();
		if (str.toString().equals(s))
			return res;
		str.delete(0, str.length());
		for (int i = 0; i < s.length(); i++) {
			empty = s.substring(0, i);
			empty += s.substring(i + 1);
		
			str.append(empty);
			str.reverse();
			//System.out.println(str);
			if (str.toString().equals(empty)) {
				
				return i;
			}
			str.delete(0, str.length());
			// System.out.println(str);
			empty = "";
		}

		// System.out.println(empty);

		return res;
	}

}
