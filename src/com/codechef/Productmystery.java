package com.codechef;

import java.util.Scanner;

public class Productmystery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter two number : ");
		int t = sc.nextInt();

		/*
		 * while (t-- > 0) { int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * int lcm = (a > b) ? a : b; while (true) { if (lcm % a == 0 && lcm % b == 0) {
		 * // System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
		 * System.out.println(lcm / a); break; } ++lcm;
		 * 
		 * } }
		 */

		while (t-- > 0) {

			int b = sc.nextInt();
			int c = sc.nextInt();
			int res = 1;
			int i = 1;
			// out:
			while (true) {
				//System.out.println(i);
				res = (b * i) % c;
				if (res == 0) {

					System.out.println(i);
					break;
				}

				i++;
			}
		}

	}

}
