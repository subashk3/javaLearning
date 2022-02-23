package com.hackerrank;

import java.util.Scanner;

public class DayProgrammer {

	public static String find(int year) {
		String res;
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				int temp = 215 + 28;
				int temp2 = 256 - temp;
				res = temp2 + ".09." + year;
			} else {
				int temp = 215 + 29;
				int temp2 = 256 - temp;
				res = temp2 + ".09." + year;
			}

		} else {
			int temp = 215 + 28;
			int temp2 = 256 - temp;
			res = temp2 + ".09." + year;
		}

		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		System.out.println(find(year));
	}

}
