package oops.interfaces;

interface SampleInterface {

	public void display();

}

public class SingleInterface {
	public static void run(SampleInterface s) {
		s.display();
	}

	public static void main(String[] args) {
		SingleInterface o = new SingleInterface();
		run(o.dis);
	}

	SampleInterface dis = new SampleInterface() {
		@Override
		public void display() {
			System.out.println("Un Implement method");
		}
	};
}