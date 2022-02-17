package com.codechef;

import java.util.Scanner;

public class CountNotebooks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int car, bike;
		int testcount = sc.nextInt();
		for (int i = 0; i < testcount; i++) {
			bike = sc.nextInt();
			car = sc.nextInt();

			if (bike == car) {

				System.out.println("SAME");
			} else if (bike > car) {

				System.out.println("CAR");
			} else
				System.out.println("BIKE");

		}

	}

}
