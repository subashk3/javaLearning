package com.codechef;

import java.util.Scanner;

public class TooManyItems {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int rem = n % 10;
			int res = n / 10;
			if (rem != 0) {

				System.out.println(++res);
			} else
				System.out.println(res);

		}

	}

}
