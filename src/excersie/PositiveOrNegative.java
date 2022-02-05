//Program to Check Whether a Number is Positive or Negative

package excersie;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int getNumber = sc.nextInt();

		if (getNumber > 0) {

			System.out.println(getNumber + " is Positive");
		} else if (getNumber < 0) {
			System.out.println(getNumber + " is Negative");
		} else
			System.out.println(getNumber + "  is Nutral");

	}

}
