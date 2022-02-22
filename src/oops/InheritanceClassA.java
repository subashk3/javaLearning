package oops;


class InheritanceClassA {
	InheritanceClassA(){
		
		System.out.println("Class A constructor");
	}
	public void methodA() {

		System.out.println("This is method A");
	}

}

class InheritanceClassB extends InheritanceClassA {

	public void methodB() {

		System.out.println("This is method B");
	}

}

class InheritanceClassC extends InheritanceClassB {

	public void methodC() {

		System.out.println("This is method C");
	}

}