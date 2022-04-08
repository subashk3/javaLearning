package com.leetcode;

import java.util.Scanner;

public class NonAdjacentFlips {
	static void solve(String s, int n) {
		int zeroCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				zeroCount++;
			}
		}
		if (zeroCount == n)
			System.out.println(0);
		else {
			boolean flag = false;
			for (int i = 0; i < n - 1; i++) {
				if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(1);
			} else
				System.out.println(2);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			String str = in.nextLine();
			solve(str, n);

		}
	}
}
