package com.codechef;

import java.util.Scanner;

public class PlusleMinunArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(solve(a));
			;
		}
	}

	private static int solve(int[] a) {
		int n = a.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				//System.out.println(a[i]);
				sum += Math.abs(a[i]);
			}
			if (i % 2 != 0) {
				sum -= Math.abs(a[i]);
			}
		}

		return sum;

	}

}
