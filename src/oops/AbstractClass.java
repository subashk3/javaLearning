package oops;

public class AbstractClass extends AbsClassSuper {
	public void absMethodOne() {
		System.out.println("First Method Action:-->");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * AbstractClass obj = new AbstractClass(); obj.absMethodOne();
		 * obj.absMethodTwo(); obj.absMethodThree();
		 */
		// obj.run2();

		Circle sh1 = new Circle("RED", 6);
		System.out.println(sh1.toString());

	}

	@Override
	public void absMethodThree() {
		System.out.println("Interface Method Action:-->");

	}

	/*
	 * @Override public void run2() { System.out.println("Run2");
	 * 
	 * }
	 */

}
