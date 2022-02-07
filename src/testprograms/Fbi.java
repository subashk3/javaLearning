package testprograms;

public class Fbi {

	public static void main(String[] args) {

		// 0 1 1 2 3 5
		int n = 10;
		int a = 0, b = 1;
		int temp;
		for (int i = 0; i <= n; i++) {

			System.out.println(a);

			temp = a;
			a = b;
			b = temp;

			a = a + b;

		}

	}

}
