/*	 
inputs: 5 -150 150000 1500000000 213333333333333333333333333333333333 -100000000000000
*/
package com.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] argh) throws IOException {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter number of test:");
		int t = sc.nextInt();
		sc.close();
		int a = 0;
		for (int i = 0; i < t; i++) {
			try {
				long n = sc.nextLong();
				if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE) {
					a = 4;
				}
				if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
					--a;
				}
				if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
					--a;
				}
				if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
					--a;
				}

				switch (a) {
				case 1:
					System.out.println(n + " can be fitted in:");
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
					break;
				case 2:
					System.out.println(n + " can be fitted in:");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
					break;
				case 3:
					System.out.println(n + " can be fitted in:");
					System.out.println("* int");
					System.out.println("* long");
					break;
				case 4:
					System.out.println(n + " can be fitted in:");
					System.out.println("* long");
					break;
				default:
					System.out.println(n + " can't be fitted anywhere. ");
				}
			} catch (Exception e) {
				System.out.println(sc.nextLine() + " can't be fitted anywhere.");
			}
		}

	}
}