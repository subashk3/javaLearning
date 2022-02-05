package oops;

abstract public class AbsClassSuper {

	abstract void absMethodOne();// fully abstract

	void absMethodTwo() { // partial abstract

		System.out.println("Second Method Action:-->");
	}
}
