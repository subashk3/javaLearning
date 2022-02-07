package excersie;

import java.util.Scanner;

public class FactorialNumberRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int getNum = sc.nextInt();
		System.out.println("Factorial Number is " + factorialNumber(getNum));

	}

	static int factorialNumber(int a) {

		if (a > 0) {

			return a * factorialNumber(a - 1);
		} else
			return 0;
	}
}
