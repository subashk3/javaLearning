package com.hackerrank;

import java.util.*;

public class SavePrisoner {
	public static int saveThePrisoner(int n, int m, int s) {
		/*
		 * int res = 0; if (n > m) { res = (s + m) > n ? n - s + m - 2 : s + m - 1; } if
		 * (n < m) { m = m % n; if (m == 1) { return s; } res = (s + m) > n ? (n - s + m
		 * - 2) : s + m - 1; } return res;
		 */

		int res = (m + s);
		res = (res - 1) % n;
		if (res == 0)
			return n;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(saveThePrisoner(n, m, s));

		}

	}

}
