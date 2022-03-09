package testprograms;

public class Maja {

	public static void main(String[] args) {

		int n = 7;
		int j = n;
		for (int i = 1; i <= n; i++) {

			if ((i > 1) && (i < j) && (j < n) && (i + j) == n) {

				System.out.println(i + " " + j);
			}
//System.out.println("o");
		}

	}

}
