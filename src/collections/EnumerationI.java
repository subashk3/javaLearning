package collections;

import java.util.*;

public class EnumerationI {

	public static void main(String[] args) {
		Vector v = new Vector<>();
		for (int i = 1; i < 11; i++) {

			v.addElement(i);
		}

		// Enumeration
		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			/*
			 * int i = (int) e.nextElement(); // type casting if (i % 2 == 0) {
			 * System.out.println(i); }
			 */
			System.out.println(e.nextElement());

		}

	}

}
