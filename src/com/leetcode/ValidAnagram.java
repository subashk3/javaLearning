package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		char[] c = s.toCharArray();
		char[] d = t.toCharArray();
		if (s.length() != t.length())
			return false;
		Arrays.sort(c);
		Arrays.sort(d);
		String temp = "";
		String temp1 = "";
		for (int i = 0; i < c.length; i++) {
			temp += c[i];
			temp1 += d[i];
		}
		if (temp.equals(temp1))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(isAnagram(s, t));
	}

}
