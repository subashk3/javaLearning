/*
 Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format


Sample input:
07:05:45PM

Sample Output :

19:05:45
 
  */
package com.hackerrank;

import java.util.Scanner;

public class TimeConversion {
	public static String timeConversion(String s) {
		// Write your code here
		String str = "";

		if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
			str = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
			s = str + s.substring(2, (s.length() - 2));
		} else if (s.substring(0, 2).equals("12") && s.contains("AM")) {
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
