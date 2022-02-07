//Program to Display Factors of a Number
package excersie;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int getNum = sc.nextInt();
		factorsNum(getNum);

	}

	static void factorsNum(int a) {

		for (int i = 1; i <= a; i++) {

			if (a % i == 0)
				System.out.print(i + " ");
		}

	}
}
