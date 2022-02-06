package excersie;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNum, exponent;

		System.out.println("Enter the Numbers:");
		firstNum = sc.nextInt();
		System.out.println("Enter exponent: ");
		exponent = sc.nextInt();
		System.out.println("Result: " + expOfNum(firstNum,exponent));

	}

	static int expOfNum(int a, int b) {

		for (int i = 2; i <= b; i++) {

			a = a * a;
		}

		return a;

	}
}
