package com.hackerrank;

import java.util.Scanner;

public class JavaDatatypes {
	public static void javaDatatypes(String[] str) {

		for (int i = 0; i < str.length; i++) {
			long temp = Long.parseLong(str[i]);

			if (temp >= Long.MAX_VALUE && temp <= Long.MIN_VALUE) {

				if (temp >= Integer.MAX_VALUE && temp <= Integer.MIN_VALUE) {
					if (temp >= Short.MAX_VALUE && temp <= Short.MIN_VALUE) {

						if (temp >= Byte.MAX_VALUE && temp <= Byte.MIN_VALUE) {
							System.out.println(temp + " can be fitted in:");
							System.out.println("* byte\r\n" + "* short\r\n" + "* int\r\n" + "* long");
						}

					} else {
						System.out.println(temp + " can be fitted in:");
						System.out.println("* int\r\n" + "* long");

					}

				} else {
					System.out.println(temp + " can be fitted in:");
					System.out.println("* long");
				}

			} else
				System.out.println(temp + " can't be fitted anywhere.");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {

			str[i] = sc.nextLine();
		}
		javaDatatypes(str);

	}
}
