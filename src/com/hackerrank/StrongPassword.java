/*Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Example


This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is .


This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is .

Function Description

Complete the minimumNumber function in the editor below.

minimumNumber has the following parameters:

int n: the length of the password
string password: the password to test
Returns

int: the minimum number of characters to add
Input Format

The first line contains an integer , the length of the password.

The second line contains the password string. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.
*/
package com.hackerrank;

import java.util.Scanner;

public class StrongPassword {

	public static int minimumNumber(int n, String password) {
		int minimum = 0;
		char temp;
		int number_count = 0, lower_case_count = 0, upper_case_count = 0, special_characters_count = 0;
		for (int i = 0; i < password.length(); i++) {
			// temp = Character.toString(password.charAt(i));
			temp = password.charAt(i);
			if (Character.isUpperCase(temp)) {
				upper_case_count = 1;
			} else if (Character.isLowerCase(temp)) {

				lower_case_count = 1;

			} else if (Character.isDigit(temp)) {

				number_count = 1;
			} else
				special_characters_count = 1;

		}
		minimum = 4 - (upper_case_count + lower_case_count + number_count + special_characters_count);
		if (n + minimum < 6)
			return 6 - n;
		else
			return minimum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String password;
		n = sc.nextInt();
		password = sc.next();
		System.out.println(minimumNumber(n, password));

	}

}
