package collections;

import java.util.*;

public class StackC {

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push("A");
		s.push("B");
		s.push("C");

		// System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.peek());// return offset
		System.out.println(s.search("A"));// return offset
		System.out.println(s.search("H"));// return offset -1
		s.pop();// remove last object
		System.out.println(s);

	}

}
