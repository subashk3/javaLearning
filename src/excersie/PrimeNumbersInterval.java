package excersie;

import java.util.Scanner;

public class PrimeNumbersInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum;
		System.out.println("Enter 1st Number: ");
		firstNum = sc.nextInt();
		System.out.println("Enter 2st Number: ");
		secondNum = sc.nextInt();

		primeNumbersInterval(firstNum, secondNum);
	}

//checking prime number
	static void primeNumberPrint(int a) {
		int temp = 0;

		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {
				temp = 1;
				break;
			}
			if (temp == 0)
				System.out.println(i + " ");

		}

	}

	// loop and print

	static void primeNumbersInterval(int firstNum, int secondNum) {

		for (int i = firstNum; i <= secondNum; i++) {

			if (i == 0 || i == 1) {
				System.out.println(i + " the number not a prime number and composite.");
				break;
			} else
				primeNumberPrint(i);

		}

	}
}
