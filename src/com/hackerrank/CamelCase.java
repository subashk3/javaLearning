package com.hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static int camelcase(String s) {
		// Write your code here
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (Character.isUpperCase(temp)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mystring;
		mystring = sc.nextLine();
		sc.close();
		System.out.println(camelcase(mystring));

			
 
	}

}
