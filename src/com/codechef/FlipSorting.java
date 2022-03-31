package com.codechef;

import java.util.Scanner;
import java.util.Vector;

public class FlipSorting {
	static void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String string = in.next();
		Vector<Vector<Integer>> res = new Vector<Vector<Integer>>();
		for (int i = n - 1; i >= 0; i--) {

			if (string.charAt(i) == '0') {
				int x = i + 1;
				for (int j = 0; j <= i; j++) {
					if (string.charAt(j) == '1') {
						String temp = "" + string.charAt(j);
						string.replace(temp, "0");
					}else {
						String temp = "" + string.charAt(j);
						string.replace(temp, "1");
					}
					

				}

			}

		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			solve();
		}

	}

}
