package excersie;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Year");
		int year = sc.nextInt();

		if (year % 4 == 0) {

			System.out.println("Entered year " + year + " is leap Year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
