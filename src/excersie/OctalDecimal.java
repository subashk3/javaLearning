//Program to Convert Octal Number to Decimal and vice-versa
package excersie;

import java.util.Scanner;

public class OctalDecimal {
	static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;
	}
	static void octal2Decimal(int a) {
		int count = countNum(a);
		int res = 0, temp;
		for (int i = 0; i < count; i++) {
			temp = a % 10;
			a = a / 10;
			res = res + (int) ((temp * Math.pow(8, i)));
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number (0 and 1):");

		int getNumb = sc.nextInt();

		octal2Decimal(getNumb);

	}

}
