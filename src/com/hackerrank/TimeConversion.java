package com.hackerrank;

public class TimeConversion {
	public static String timeConversion(String s) {
		// Write your code here
		int lenthofstring = s.length();
		String getstring = s.substring(lenthofstring - 2);
		String time = s.substring(0, 8);

		if (getstring == "AM") {

			if (s.substring(0, 2) == "12") {

				time = time.replaceFirst("12", "00");
			}

		}

		return time;

	}

	public static void main(String[] args) {

		String s = "12:01:00AM";
		
		System.out.println(timeConversion(s));

		//timeConversion(s);
		// System.out.println(s.substring(0,2));

		// Integer.parseInt(s.substring(0,2));
		// System.out.println(Integer.parseInt(s.substring(0,2))+1);

	}

}
