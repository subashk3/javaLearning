package oops;

interface Sample {

	public int add(int a, int b);

}

public class InF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ClassB o = new ClassB(this);

		ClassB o1 = new ClassB(a);
		// int c = a;
		// System.out.println(o1);
		o1.run(a);
		// int date = o1.dob(a);
	}

	static Sample a = new Sample() {

		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a + b;
		}
	};

	/*
	 * @Override public int add(int a, int b) { // TODO Auto-generated method stub
	 * return 0; }
	 */

}
