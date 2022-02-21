package com.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class LazySalesman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] a = new int[N];
			for (int j = 0; j < N; j++) {
				a[j] = sc.nextInt();
			}
			int temp = 0, c = 0;
			Arrays.sort(a);
			for (int j = N - 1; j >= 0; j--) {

				temp += a[j];
				if (temp >= W) {
					System.out.println(j);
					break;
				}

			}
		}
	}
}
