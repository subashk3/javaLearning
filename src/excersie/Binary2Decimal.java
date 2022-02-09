//Program to Convert Binary Number to Decimal and vice-versa
package excersie;

import java.util.Scanner;

public class Binary2Decimal {
	// calculate count of the integer
	public static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;
	}

//binary to Decimal
	public int binary2Decimal(int a) {
		int count = countNum(a);
		int res = 0, temp;
		for (int i = 0; i < count; i++) {
			temp = a % 10;
			a = a / 10;
			// System.out.println(temp + " " + i);
			res = res + (int) ((temp * Math.pow(2, i)));
		}
		return res;
	}

//Decimal to binary
	public int decimal2Binary(int getnumber) {

		int reminder;
		String stringinput = "";
		while (getnumber != 0) {
			reminder = getnumber % 2;
			stringinput = stringinput + reminder;
			getnumber /= 2;
		}
		// temperay variable
		String temp = "";

		// reverse the string
		for (int i = stringinput.length() - 1; i >= 0; i--) {
			temp += stringinput.charAt(i);
		}

		// System.out.println(temp);
		int binary = Integer.parseInt(temp);

		return binary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Binary2Decimal obj = new Binary2Decimal();

		System.out.println("Enter your choise");
		System.out.println("1. Binary Number to Decimal");
		System.out.println("2. Decimal Number to Binary");
		int choise = sc.nextInt();
		if (choise == 1) {
			System.out.println("Enter the Binary Number (0 and 1):");
			int getnum = sc.nextInt();
			System.out.println(obj.binary2Decimal(getnum));
		} else if (choise == 2) {
			System.out.println("Enter the Decimal Number:");
			int getnumtwo = sc.nextInt();
			System.out.println(obj.decimal2Binary(getnumtwo));

		}

	}

}
