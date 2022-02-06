//Program to Check Whether a Character is an Alphabet or not

package excersie;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character:");
		char inChar = sc.next().charAt(0);

		if (inChar >= 'a' && inChar <= 'z' || inChar >= 'A' && inChar <= 'Z') {

			System.out.println(inChar + " your enter Alphabet");
		} else
			System.out.println(inChar + " your enter Not Alphabet");
	}

}
