package com.hackerrank;

import java.io.*;
import java.util.*;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * int t = sc.nextInt(); int a[][] = new int[t][]; for (int i = 0; i < t; i++) {
		 * int n = sc.nextInt(); for (int j = 0; j < n; j++) { a[i][j] = sc.nextInt(); }
		 * } int ip = sc.nextInt(); while (ip-- >0) { int i = sc.nextInt(); int j =
		 * sc.nextInt(); try { System.out.println(a[i][j]); } catch
		 * (ArrayIndexOutOfBoundsException e) { System.out.println("ERROR!"); }
		 * 
		 * }
		 */
		ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int count = sc.nextInt();

			int[] temp = new int[count];

			if (count == 0)

				for (int j = 0; j < count; j++) {

					
				}
			ar.addAll(ar);

		}
		int v = sc.nextInt();
		while (v-- > 0) {

			int i = sc.nextInt();
			int j = sc.nextInt();

		}

	}

}
