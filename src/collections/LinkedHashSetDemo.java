package collections;

import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String[] args) {

		LinkedHashSet lh = new LinkedHashSet();
		lh.add("K");
		lh.add("B");
		lh.add("A");
		lh.add("C");
		lh.add("D");
		System.out.println(lh.add("A"));
		System.out.println(lh);
		
	}
}
