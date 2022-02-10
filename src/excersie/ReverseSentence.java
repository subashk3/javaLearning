//63.program to Reverse a Sentence Using Recursion
package excersie;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputString = new String();
		System.out.println("Enter the string: ");
		inputString = sc.nextLine();

		String replaceString = "";

		int index = inputString.length();

		// Changing letter using index value
		for (int i = index - 1; i >= 0; i--) {
			replaceString += inputString.charAt(i);
		}
		System.out.println("Normal Method: " + replaceString);

		System.out.println("Recursion Method: " + reverse(inputString));

	}
	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);
	}
}
