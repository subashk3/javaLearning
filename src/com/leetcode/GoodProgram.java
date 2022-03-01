package com.leetcode;

import java.util.Scanner;

public class GoodProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();

			if (x % 4 == 0) {

				System.out.println("Good");
			} else
				System.out.println("Not Good");

		}

	}

}
