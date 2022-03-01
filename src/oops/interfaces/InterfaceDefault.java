package oops.interfaces;

interface Round1 {

	default void run() {
		System.out.println("Beginner Level");
	}

	static void runStatic() {
		System.out.println("Static method run");
	}
}

interface Round2 {

	default void run() {
		System.out.println("Intermediate Level");
	}
}

interface Round3 extends Round1, Round2 {

	default void run() {
		System.out.println("Advance Level");
	}
}

public class InterfaceDefault implements Round3 {

	public static void main(String[] args) {

		InterfaceDefault nn = new InterfaceDefault();

		nn.run();// default method only access object.
		System.out.println();
		Round1.runStatic();// static method run as usual

	}

}
