package com.codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class UnchangingOR {
	static ArrayList<Integer> solve(int n) {
		/*
		 * if (n == 2) return n;
		 */	int temp;
		int ch = 1;
		int flag = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		for (int i = 2; i <= n; i++) {
			temp = ch | i;
			ch = temp;
			arrayList.add(ch);
		}

		// System.out.println(arrayList);
		/*
		 * for (int i = 1; i <n; i++) { if (arrayList.get(i) == arrayList.get(i - 1)) {
		 * flag++; } } if (flag>0) return flag; else { return 0; }
		 */
		return arrayList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * int t = scanner.nextInt(); while (t-->0) { int n =scanner.nextInt();
		 * System.out.println(solve(n)); }
		 */

		ArrayList<Integer> arrayList = solve(1000);
	}

}
