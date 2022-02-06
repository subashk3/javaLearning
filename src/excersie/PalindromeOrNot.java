//Program to Check Whether a Number is Palindrome or Not
package excersie;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int numBer = sc.nextInt();
		checkPalindrome(numBer);
	}

	
	
	static void checkPalindrome(int a) {
		int firstCopy = a;
		int outNum = 0, temp;

		while (a != 0) {

			temp = a % 10;

			outNum = (outNum * 10) + temp;

			a = a / 10;
		}

		
		if(firstCopy== outNum) {
			
			System.out.println(firstCopy + " is Palindrome.");
		}else
			System.out.println(firstCopy + " is Not Palindrome.");
		
		
	}
}
