package excersie;

public class LargestNumber {

	public static void main(String[] args) {
		int a = 121, b = 25, c = 331;

		int res = (a > b && a > c) ? a : ((b > c) ? b : c);

		System.out.println("Biggest Number is: " + res);

	}

}
