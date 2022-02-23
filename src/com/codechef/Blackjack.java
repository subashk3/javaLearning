package com.codechef;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			int res = 21 - (a + b);

			if (res <= 10) {
				System.out.println(res);
			} else
				System.out.println(-1);

		}

	}

}
