package com.codechef;

import java.util.Scanner;

public class AlternatingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n =sc.nextInt();
			String string = sc.next();
			int zeroCount = 0;
			int oneCount = 0;

			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == '0') {
					zeroCount++;
				} else {
					oneCount++;
				}
			}
			if (zeroCount == oneCount) {
				System.out.println((2 * zeroCount));
			} else if (zeroCount < oneCount) {
				System.out.println((2 * zeroCount) + 1);
			} else {
				System.out.println((2 * oneCount) + 1);
			}

		}

	}

}
