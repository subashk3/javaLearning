//Program to Check Whether a Number is Prime or Not (only divided same and 1)
package excersie;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int getNum = sc.nextInt();
		checkPrime(getNum);
	}

	static void checkPrime(int a) {
		int temp = 0;
		if (a == 0 || a == 1)
			System.out.println(a + " the number not a prime number and composite.");

		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {
				temp = 1;
				break;
			}
		}
		if (temp == 0)
			System.out.println(a + " is prime number.");
		else
			System.out.println(a + " is not prime number.");

	}
}
