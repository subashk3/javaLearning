//61.Program to Convert Octal Number to Decimal and vice-versa
package excersie;

import java.util.Scanner;

public class OctalNumber2Decimal {
	//Octal Number to Decimal 
	public static void octalToDecimal(int num) {
		int n = num;
		int decimal = 0;
		int count = 0;
		int digit;
		while (n != 0) {
			digit = n % 10;
			if (digit < 8) {
				decimal += digit * Math.pow(8, count++);
				n /= 10;
			} else {
				System.out.println("Give Binary Formal 0's and 1's");
				break;
			}
		}
		if (decimal != 0)
			System.out.print("Decimal value of " + num + " is " + decimal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal to Decimal");
		octalToDecimal(sc.nextInt());

	}
}
