//program to calculate the power using recursion
package excersie;

import java.util.Scanner;

public class PowerRecursion {

	static int powerOfTwo(int a, int b) {

		if (b != 0) {

			return a * powerOfTwo(a, b - 1);
		} else
			return 1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base nummber:");
		int baseNum = sc.nextInt();
		System.out.println("Enter the power nummber:");
		int powerNum = sc.nextInt();

		System.out.println("Power of the number " + powerOfTwo(baseNum, powerNum));

	}

}
