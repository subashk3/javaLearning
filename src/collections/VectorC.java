package collections;

import java.util.*;

public class VectorC {

	public static void main(String[] args) {

		Vector v = new Vector<>();// inital capacity 10;
//		Vector v = new Vector<>(25);
//		Vector v = new Vector<>(10, 3);
//		Vector v = new Vector<>(Collection c);

		System.out.println(v.capacity());
		for (int i = 1; i < 11; i++) {

			v.addElement(i);
		}
		v.addElement("Subash");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
