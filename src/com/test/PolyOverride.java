package com.test;
// Method overriding 
class A {
	public void run() {
		System.out.println("Class A");
	}
}
class B extends A {
	// override class a method
	public void run() {

		System.out.println("Class B");
	}
}

public class PolyOverride {
	public static void main(String[] args) {
		B oB = new B();
		oB.run();

	}

}
