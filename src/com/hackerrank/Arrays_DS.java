package com.hackerrank;

import java.util.Scanner;

public class Arrays_DS {
	public static void revArray(int[] a) {

		int[] rev = new int[a.length];
		int j = 0;
		for (int i = a.length-1; i >= 0; i--) {

			rev[j] = a[i];
			j++;
		}
		for(int k: rev) {
			System.out.print(k+" ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {

			scores[i] = sc.nextInt();
		}

		revArray(scores);

	}

}
