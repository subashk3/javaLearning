package com.codechef;

import java.util.Scanner;

public class CompleteCredit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			if (x > 65) {

				System.out.println("Overload");
			} else if (x < 35) {
				System.out.println("Underload ");
			} else
				System.out.println("Normal ");
		}

	}

}
