package excersie;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dividend, divisor, reminder, quotient;

		System.out.println("Enter the Dividend:");

		dividend = sc.nextInt();

		System.out.println("Enter the Divisor (0 is not allow):");

		divisor = sc.nextInt();

		System.out.println();
		divisor = dividend / divisor;
		System.out.println("Remainder is: " + divisor);

		reminder = dividend % divisor;
		System.out.println("Remainder is: " + reminder);

	}

}
