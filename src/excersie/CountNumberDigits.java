//Program to Count Number of Digits in an Integer
package excersie;

import java.util.Scanner;

public class CountNumberDigits {

	static int countNumber(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;

		} while (a != 0);

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int numBer = sc.nextInt();

		System.out.println("Number of count is: " + countNumber(numBer));

	}

}
