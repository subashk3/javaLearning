package testprograms;
final class Comp{
	private double re;
	private double im;
	public Comp(double re,double im) {
		
		this.re=re;
		this.im=im;
	}
	public String toString() {
		
		return "("+re+" "+im+"i)";
	}
	
	
}
public class Fbi {

	public static void main(String[] args) {

		// 0 1 1 2 3 5
		/*
		 * int n = 10; int a = 0, b = 1; int temp; for (int i = 0; i <= n; i++) {
		 * 
		 * System.out.println(a);
		 * 
		 * temp = a; a = b; b = temp;
		 * 
		 * a = a + b;
		 * 
		 * }
		 */
		
		Comp obj = new Comp(10,15);
		System.out.println(obj);
	}

}
