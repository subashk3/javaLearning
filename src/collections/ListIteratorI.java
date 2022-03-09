package collections;

import java.util.*;

public class ListIteratorI {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Ajith");
		l.add("Vijay");
		l.add("Kumar");
		l.add("Ravi");
		ListIterator it = l.listIterator();

		while (it.hasNext()) {

			String s = (String) it.next();
			if (s.equals("Ajith")) {
				it.remove();// remove the object
			} else if (s.equals("Vijay")) {

				it.set("Vijay Kumar"); // replace the object

			} else if (s.equals("Kumar")) {

				it.add("Suresh Kumar"); // add object
			}
		}
		System.out.println(l);

	}

}
