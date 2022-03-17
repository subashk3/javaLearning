package com.codechef;

import java.util.Scanner;

public class ChefChocolates {
	public static int solve(int c, int x, int y) {

		int ans = Math.abs(c - x) * y;

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int c = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(solve(c, x, y));

		}

	}

}
