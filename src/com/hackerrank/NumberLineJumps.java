package com.hackerrank;

import java.util.Scanner;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here

		int remider;

		remider = (x1 - x2) % (v2 - v1);

		String res = "";
		if (v1 > v2) {
			if (remider == 0) {
				res = "YES";

			}
		} else {

			res = "NO";

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		System.out.println(kangaroo(x1, v1, x2, v2));
	}
}// 0 3 4 2
