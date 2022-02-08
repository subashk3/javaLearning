//33.Program to Check Whether a Character is a Vowel or Consonant

package excersie;

import java.util.Scanner;

public class CheckVowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character:");
		char letter = sc.next().charAt(0);


		if ('a' == letter || 'A' == letter || 'e' == letter || 'E' == letter || 'i' == letter || 'I' == letter
				|| 'o' == letter || 'O' == letter || 'u' == letter || 'U' == letter) {

			System.out.println(letter + " is Vowel.");
		} else
			System.out.println(letter + " is Consonant.");

	}

}
