package com.hackerrank;

import java.util.*;

public class BeautifulDays {

	public static int reverseNumber(int a) {
		int rem;
		int res = 0;
		while (a != 0) {
			rem = a % 10;
			res = (res * 10) + rem;
			a = a / 10;
		}

		return res;
	}

	public static int beautifulDays(int i, int j, int k) {
		// Write your code here

		int count = 0;
		for (int a = i; a <= j; a++) {
			int temp = reverseNumber(a);

			//System.out.println(a+" reververs "+ temp);
			//System.out.println((Math.abs(a - temp)));
			if ((Math.abs(a - temp)) % k == 0) {

				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(beautifulDays(i, j, k));

	}

}
