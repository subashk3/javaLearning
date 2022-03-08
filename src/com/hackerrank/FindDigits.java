/*https://www.hackerrank.com/challenges/find-digits/problem*/
package com.hackerrank;

import java.util.Scanner;

public class FindDigits {
	public static int findDigits(int n) {

		int count = 0;
		int temp = n;
		int rem;
		while (n > 0) {
			rem = n % 10;
			if (rem != 0 && (temp) % rem == 0) {
				count++;
			}

			n = n / 10;

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(findDigits(n));
		}

	}

}
