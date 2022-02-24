package com.hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {

		int move = 0;
		int count = 0;

		for (int i = 0; i < steps; i++) {

			if (path.charAt(i) == 'U') {

				if (move == -1) {

					count++;
				}
				move++;
			}
			if (path.charAt(i) == 'D') {
				move--;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int step = sc.nextInt();
		String s = sc.next();
		System.out.println(countingValleys(step, s));

	}

}
