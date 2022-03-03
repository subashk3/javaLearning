package com.codechef;

import java.util.Scanner;

public class CountHolidays {

	public static void ans(int a[], int n) {
		int temp[] = { 6, 7, 13, 14, 20, 21, 27, 28 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (a[i] == temp[j]) {
					count++;
				}
			}
		}
		int holidays = 8 + n - count;
		System.out.println(holidays);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			ans(a, n);

		}

	}

}
