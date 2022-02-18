//56.Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
package excersie;

import java.util.Scanner;

public class SumTwoPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int num = sc.nextInt();
		sc.close();
		sumOfPrime(num);
	}

// checking prime or not
	static boolean checkPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				flag = true;
				break;
			}
		}
		return flag; // flase == prime number
	}

//Checking Whether a Number can be Expressed as Sum of Two Prime Numbers

	static void sumOfPrime(int num) {
		boolean flag = false;
		for (int i = 2; i < num; i++) {

			if (checkPrime(i) == false) {
				if (checkPrime(num - i) == false) {
					System.out.println((num - i) + " + " + i + " = " + num);
					flag = true;
				}
			}

		}
		if (flag == false) {
			System.out.println("Number cann't be Expressed as Sum of Two Prime Numbers");
		}

	}
}
