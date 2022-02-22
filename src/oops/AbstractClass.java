package oops;

public class AbstractClass extends AbsClassSuper implements InterfaceClassSuper {
	public void absMethodOne() {
		System.out.println("First Method Action:-->");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsClassSuper obj = new AbstractClass();
		obj.absMethodOne();
		obj.absMethodTwo();

	}

	

}
