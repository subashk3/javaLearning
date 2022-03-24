package com.codechef;

import java.util.Scanner;

public class EconomicsClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int count = 0;
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();

			} // b[i] = sc.nextInt();
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();

			}

			for (int i = 0; i < n; i++) {
				if (a[i] == b[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
