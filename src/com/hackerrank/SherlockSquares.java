package com.hackerrank;

import java.util.Scanner;

public class SherlockSquares {

	public static int squares(int a, int b) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			float x = (float) Math.sqrt(i) % 1;
			if (x == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(squares(a, b));
			;
		}

		// System.out.println(x % 1);

	}
}
