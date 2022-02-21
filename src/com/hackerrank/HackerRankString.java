package com.hackerrank;

import java.util.Scanner;

public class HackerRankString {
	public static String hackerrankInString(String s) {
		// Write your code here
		String str = "hackerrank";
//		String empty = "";
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < s.length(); j++) {

				if (str.charAt(i) == s.charAt(j)) {
					flag = true;

				} else
					flag = false;

			}

		}
		if (flag == true) {

			return "YES";
		} else
			return "NO";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			s = sc.next();
			System.out.println(hackerrankInString(s));

		}
	}

}
