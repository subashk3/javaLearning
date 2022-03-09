package com.codechef;

import java.util.Scanner;

public class FillBucket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int x = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(Math.abs(x - k));

		}

	}

}
