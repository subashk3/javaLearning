package excersie;

import java.util.Scanner;

public class PyramidPattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows;
		System.out.println("Enter you Number of Rows: ");
		rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) { // Row loop

			for (int k = i; k < rows; k++) { // space loop
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) { // first number loop

				System.out.print(j + " ");
			}

			for (int x = i - 1; x >= 1; x--)
				System.out.print(x + " ");
			System.out.println();
		}
		sc.close();
	}

}
