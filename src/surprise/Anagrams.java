package surprise;

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
	public void isAnagram(String firString, String secString) {
		// first case:
		if (firString.length() != secString.length()) {
			System.out.println("Giver Strings are Not anagrams.");
		}
		// Get arrays	
		char first[] = firString.toLowerCase().toCharArray();
		char second[] = secString.toLowerCase().toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		boolean res = Arrays.equals(first, second);
		if (res) {
			System.out.println("Giver Strings are anagrams.");

		} else {
			System.out.println("Giver Strings are Not anagrams.");
		}
	}
	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		Anagrams objAnagrams = new Anagrams();
		String stringOne = "Listen";
		String stringTwo = "Silent";
		objAnagrams.isAnagram(stringOne, stringTwo);
		inScanner.close();
	}

}
