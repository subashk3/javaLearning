package com.codechef;

import java.util.Scanner;

public class GetLowestFree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a < b && a < c) {

				System.out.println(b + c);

			} else if (b < c) {

				System.out.println(a + c);

			} else {

				System.out.println(a + b);

			}
		}

	}

}
