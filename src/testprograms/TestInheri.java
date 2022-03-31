package testprograms;

class A {
	int a = 10;

	public void run() {

		System.out.println("Run A ");
	}

}

class B extends A {
	int a = 20;

	public void run() {

		System.out.println("Run B ");
//		super.run();
	}

}

public class TestInheri {

	public static void main(String[] args) {

		A o = new B();
//		B o = new B();
		o.run();
		System.out. println(o.a);

	}

}
