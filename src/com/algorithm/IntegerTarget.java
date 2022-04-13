package com.algorithm;

import java.util.Scanner;

public class IntegerTarget {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int target = in.nextInt();

		pairReturn(a, target);

		in.close();

	}

	private void pairReturn(int[] a, int target) {
		int[] result = new int[2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		for (int val : result) {
			System.out.print(val+" ");
		}

	}

	public static void main(String[] args) {
		IntegerTarget o = new IntegerTarget();
		o.solve();
	}

}
