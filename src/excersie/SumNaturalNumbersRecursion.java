//Program to Find the Sum of Natural Numbers using Recursion
package excersie;

import java.util.Scanner;

public class SumNaturalNumbersRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");

		int getNum = sc.nextInt();

		System.out.println(naturalSum(getNum));

	}

	static int naturalSum(int a) {

		if (a > 0) {

			return a + naturalSum(a - 1);
		} else
			return 0;

	}
}
