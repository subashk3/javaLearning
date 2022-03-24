package com.codechef;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int ans = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();
			if (x == n) {
				ans = n + 1;
			} else if (n > x) {
				ans = (n - x) + (n + 1);
			} else if (n < x) {
				ans = (n + 1) - (x - n);
			}
			System.out.println(ans);
		}

	}
}