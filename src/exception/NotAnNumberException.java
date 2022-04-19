package exception;

import java.util.LinkedList;

public class NotAnNumberException {
	public static void main(String[] args) {
		// System.out.println("Hello");
		LinkedList k = new LinkedList();
		LinkedList y = new LinkedList();
		k.add(12);
		k.add("String");
		y=(LinkedList) k.clone();
		System.out.println(y);
	}
}
