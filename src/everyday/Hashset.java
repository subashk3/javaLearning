package everyday;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashset {

	public static void main(String[] args) {
		/// LinkedHashSet hs = new LinkedHashSet();
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(54);
		hs.add(14);
		hs.add(198);
		hs.add(1);
		hs.add(1);

		System.out.println(hs);
		
		TreeSet tr = new TreeSet(hs);

		System.out.println(tr);

		// String[] ar = (String[]) hs.clone();

		// System.out.println(ar.toString());

		// Iterator it = (Iterator) hs.iterator();

		// System.out.println(hs.size());

	}

}
