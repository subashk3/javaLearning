package everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CompareClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String[] names = { "Subash", "Bingu", "Sudhakar", "Kumar", "Ajith" };
		 * 
		 * Arrays.sort(names); CompareDemo comp = new CompareDemo();
		 * 
		 * Arrays.sort(names, comp);
		 * 
		 * for (String str : names) System.out.println(str);
		 * 
		 */
		System.out.println("Array List:");
		ArrayList ar = new ArrayList();

		for (int i = 0; i < 5; i++) {

			ar.add(i, sc.next());
		}
		
		java.util.Iterator it = ar.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		// Arrays.sort(ar);
		System.out.println(ar);

	}

}
