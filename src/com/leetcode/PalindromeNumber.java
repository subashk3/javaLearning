package com.leetcode;

import java.util.Scanner;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		String temp = Integer.toString(x);
		if (temp.charAt(temp.length() - 1) == '0' && x > 0)
			return false;
		String t = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			t += temp.charAt(i);
		}
		if (Long.parseLong(t) == x)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(isPalindrome(x));

		sc.close();

	}

}
