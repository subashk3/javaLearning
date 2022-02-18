package oops;

public class AccessModifier {

	public static void main(String[] args) {
		ProtectClass o = new ProtectClass();

		o.empage = 23;
		System.out.println(o.empage);
		
		o.run();
		

	}

}
