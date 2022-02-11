package com.hackerrank;

import java.util.Scanner;

public class TimeConversion {
	public static String timeConversion(String s) {
		// Write your code here
		String str = "";

		if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
			str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
			s = str + s.substring(2, (s.length() - 2));
		}else if (s.substring(0, 2).equals("12") && s.contains("AM")) {
			str = "00";
			s = str + s.substring(2, s.length() - 2);
		} else {
			s = s.substring(0, s.length() - 2);

		}

		return s;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();

		System.out.println(timeConversion(s));

		// timeConversion(s);
		// System.out.println(s.substring(0,2));

		// Integer.parseInt(s.substring(0,2));
		// System.out.println(Integer.parseInt(s.substring(0,2))+1);

	}

}
