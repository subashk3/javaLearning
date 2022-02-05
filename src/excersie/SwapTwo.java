package excersie;

public class SwapTwo {

	public static void main(String[] args) {

		int a = 15, b = 12;
		int temp;
		// Third variable

		temp = a;
		a = b;
		b = temp;
		System.out.println("With 3rd variable\n");

		System.out.println("A value is: " + a);

		System.out.println("B value is: " + b+"\n");

		
		System.out.println("Without 3rd variable\n");
		
		int x = 15, y = 12;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X value is: " + x);

		System.out.println("Y value is: " + y);

	}

}
