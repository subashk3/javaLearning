package com.codechef;

import java.util.Scanner;

public class ChefWaterBottles {

	public static int solve(int n, int x, int k) {

		if (n > (k / x)) {
			return (k / x);
		} else
			return n;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int x = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(solve(n, x, k));

		}

	}

}
