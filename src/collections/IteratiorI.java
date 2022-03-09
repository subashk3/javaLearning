package collections;

/*
Methods
public boolean hasNext();
public Object next();
public void remove();

*/

import java.util.*;

public class IteratiorI {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		for (int i = 1; i < 11; i++) {
			l.add(i);
		}
		System.out.println(l);

		Iterator it = l.iterator();

		while (it.hasNext()) {

			int i = (int) it.next();
			if (i % 2 == 0)
				it.remove();
		}
		System.out.println(l);
	}

}
