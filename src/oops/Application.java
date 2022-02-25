package oops;

//Non- static Inner class
class Other {
	class InnerClass {

		public void inClass() {

			System.out.println("This is inner class Method");
		}

	}

}

//Static Inner class
class Other1 {
	static class StaticInner {
		public void staticClass() {
			System.out.println("This is static inner class Method");
		}
	}
}

// Local class Only visible in local class
class Other2 {

	public void localMethod() {

		class LocalClass { // Local Methods

			public void run() {
				System.out.println("This is Local inner class Method");
			}
		}

		LocalClass n = new LocalClass();
		n.run();
	}

}


abstract class AnonyClas{
	
	
	abstract void anonymus(); 
}
public class Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------------------");
		System.out.println();
		// Non static inner class
		Other o = new Other();
		Other.InnerClass ob = o.new InnerClass();
		ob.inClass();

		System.out.println();

		// Static inner class
		Other1.StaticInner o1 = new Other1.StaticInner();
		o1.staticClass();

		// Local Innner Class

		Other2 o2 = new Other2();
		o2.localMethod();

		// Anonymous Class
		AnonyClas o3 = new AnonyClas() {
			@Override
			void anonymus() {
				System.out.println("This is anonymus inner class Method");				
			}
		};
		
		o3.anonymus();
		
		

	}


}
