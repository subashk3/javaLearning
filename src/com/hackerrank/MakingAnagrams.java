package com.hackerrank;

import java.util.Scanner;

public class MakingAnagrams {

	public static int makingAnagrams(String s1, String s2) {
		int count = 0;
		StringBuffer str1 = new StringBuffer(s1);
		StringBuffer str2 = new StringBuffer(s2);

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		System.out.println(makingAnagrams(s1, s2));
	}

}
