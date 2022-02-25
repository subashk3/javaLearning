package com.hackerrank;

import java.util.*;

public class UtopianTree {

	public static int utopianTree(int n) {

		int h = 1;

		for (int i = 0; i < n; i++) {

			if (h % 2 != 0) {

				h = h * 2;
			} else
				h += 1;

		}
		// System.out.println(h);

		return h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			System.out.println(utopianTree(n));

		}

	}

}
