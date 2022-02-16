package everyday;

import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashset {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		// HashSet hs = new HashSet();

		hs.add("Subash");
		hs.add("Subash");
		hs.add("Chandra");
		hs.add("Bose");
		hs.add("Bose");
		hs.add("Bose");
		hs.add("Bose");
		hs.add("Bose");
		hs.add("Bose");
		hs.add("Bose");

		System.out.println(hs);
		// String[] ar = (String[]) hs.clone();

		// System.out.println(ar.toString());

		// Iterator it = (Iterator) hs.iterator();
		// System.out.println(hs.size());

	}

}
