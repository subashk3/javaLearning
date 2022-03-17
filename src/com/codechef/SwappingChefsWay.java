package com.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingChefsWay {
	public static String solve(String s, int n) {
		String res = "";
		String zero = "";
		String one = "";
		/*
		 * char[] t = s.toCharArray(); Arrays.sort(t); String temp = ""; for (char c :
		 * t) temp += c;
		 */

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				one += s.charAt(i);
			} else
				zero += s.charAt(i);

		}
		res = zero + one;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			System.out.println(solve(s, n));
		}

	}

}
