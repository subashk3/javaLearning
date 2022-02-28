package testprograms;

public class Ptn {

	public static void main(String[] args) {

		int n = 5;

		/*
		 * for (int i = 0; i < n; i++) {
		 * 
		 * for (int j = 0; j < n; j++) { if (i == j) System.out.print("* "); else if (i
		 * + j == n - 1) System.out.print( "* "); else System.out.print(" ");
		 * 
		 * } System.out.println(); }
		 */

		String s = "* ";

		String s1 = " ";

		for (int i = 1; i <= n; i++) {

			System.out.print(s1.repeat(n - i));

			System.out.print(s);

			s += "* ";

			System.out.println();

		}

	}

}
