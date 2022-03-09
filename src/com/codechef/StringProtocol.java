package com.codechef;

import java.util.Scanner;

public class StringProtocol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			solve(s, n);
		}

	}

	private static void solve(String s, int n) {
		int i = 0;
		int count = 0;
		int t = n;
		while (i < n) {
			if ((i + 1) < n && s.charAt(i) == s.charAt(i + 1)) {
				count++;

				i = i + 2;
			} else {
				count++;
				i++;
			}
		}
		System.out.println(count);

	}

}
