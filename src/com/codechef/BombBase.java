package com.codechef;

import java.util.HashMap;
import java.util.Scanner;

public class BombBase {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); HashMap<Integer, Integer> map = new
		 * HashMap<Integer, Integer>(); int t = sc.nextInt();
		 * 
		 * while (t-- > 0) {
		 * 
		 * int n = sc.nextInt(); int x = sc.nextInt(); // int a[] = new int[n]; for (int
		 * i = 0; i < n; i++) { map.put(i + 1, sc.nextInt()); }
		 */
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			int res=0;
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
				if (a[j] < x) {
					res = j + 1;
				}
			}
			System.out.println(res);

		}
	}
}