package com.hackerrank;

import java.util.*;

public class DrawingBook {

	public static int pageCount(int n, int p) {
		int count = 0;

		int frontside = p / 2;
		int reverseside = (n - p) / 2;

		if (n == p || n == 2) {

			return 0;
		} else if (n % 2 == 0 && n - p == 1) {

			return 1;
		} else
			return Math.min(frontside, reverseside);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(pageCount(n, p));
	}

}
