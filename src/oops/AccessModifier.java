package oops;

import java.util.Arrays;

public class AccessModifier {

	public static void main(String[] args) {
		ProtectClass o = new ProtectClass();

		o.empage = 23;
		// System.out.println(o.empage);

		// o.run();

		int a[] = { 2, 4, 3 };

		int b[] = { 5, 6, 4 };
		/*
		 * int ta[] = new int [a.length]; int tb[] = new int [b.length];
		 */

		String firstnum = "";
		String secondnum = "";

		for (int i = a.length - 1; i >= 0; i--) {

			firstnum += a[i];
		}
		for (int i = b.length - 1; i >= 0; i--) {

			secondnum += b[i];
		}
		int result = Integer.parseInt(firstnum) + Integer.parseInt(secondnum);
		String rev = Integer.toString(result);

		int atm[] = new int[rev.length()];
		for (int i = b.length - 1; i >= 0; i--) {

			atm[i] = rev.charAt(i);
		}
		
		Arrays.sort(atm);
		
		
	}

}
