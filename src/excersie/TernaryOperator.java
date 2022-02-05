package excersie;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age;

		System.out.println("Enter your are: ");

		age = sc.nextInt();

		boolean temp = age > 18 ? true : false; // Ternary Operator ?

		if (temp) {

			System.out.println("Your are eligible...");
		} else
			System.out.println("Your Not are eligible...");

		sc.close();
	}

}
