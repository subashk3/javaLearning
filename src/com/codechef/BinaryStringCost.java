package com.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringCost {

	static void check(String string, int n, int x, int y) {

		if (!string.contains("1")) {
			System.out.println(0);
		} else if (x < y) {

			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int t = in.nextInt(); while (t-- > 0) { int n = in.nextInt(); int x =
		 * in.nextInt(); int y = in.nextInt(); in.nextLine(); String string =
		 * in.nextLine();
		 * 
		 * check(string, n, x, y);
		 * 
		 * }
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int max = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < n && i <= k; i++) {
				if (arr[i] > max)
					max = arr[i];
			}
			System.out.println(max);
		}
	}
}
