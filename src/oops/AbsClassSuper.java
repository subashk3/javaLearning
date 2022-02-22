package oops;

abstract public class AbsClassSuper implements InterfaceClassSuper{

	public abstract void absMethodOne();// fully abstract

	public void absMethodTwo() { // partial abstract

		System.out.println("Second Method Action:-->");
	}
}
