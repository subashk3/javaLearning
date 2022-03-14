package com.leetcode;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {

		int j = 0;
		String s = "";

		for (int i = 0; i < strs.length; i++) {
			char temp = strs[0].charAt(j);
			if (strs[i].charAt(j) == temp) {
				s += temp;
			} else
				return "";

			j++;
		}
		return s;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int n = sc.nextInt(); String a[] = new String[n];
		 * 
		 * for(int i= 0;i<n;i++) { a[i]=sc.next(); }
		 */
		String a[] = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(a));

	}

}
