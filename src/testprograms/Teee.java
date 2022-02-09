package testprograms;

import java.util.Scanner;

public class Teee {
	public int decimal2Binary(int getnum) {
		int rem, decimalnumber = 0;
		String s1 = "";
		while (getnum != 0) {
			rem = getnum % 2;
			if (rem == 1 || rem == 0) {
				s1 = s1 + rem;
			}
			getnum /= 2;
		}

		String temp = "";
		for (int i = 0; i < s1.length(); i++) {

		}
		for (int i = s1.length() - 1; i >= 0; i--) {
			temp += s1.charAt(i);
		}
		System.out.println(temp);
		;
		int k = Integer.parseInt(temp);
		return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Teee ob = new Teee();
		ob.decimal2Binary(24);
	}

}
