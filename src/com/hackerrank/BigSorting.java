package com.hackerrank;

import java.util.*;

public class BigSorting {

	public static String bigSorting(String[] a) {
		long[] temp = new long[a.length];
		for (int i = 0; i < a.length; i++) {
			temp[i] = Integer.parseInt(a[i]);

		}

		/*
		 * for (int i = 0; i < a.length; i++) { for (int j = i + 1; j < a.length; j++) {
		 * if (a[i] > a[j]) { String temp = a[j]; a[j] = a[i]; a[i] = temp; } } }
		 */

		return "";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] a = new String[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextLine();

		System.out.println(bigSorting(a));

	}

}