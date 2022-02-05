package excersie;

import java.util.Scanner;

public class PyramidPattern_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows;
		System.out.println("Enter you Number of Rows: ");
		rows = sc.nextInt();

		for (int i = rows; i >= 1; i--) { // row loop

			for (int k = i; k > 1; k--) { // space loop
				System.out.print("  ");
			}
			for (int j = i; j <= rows; j++) { // first triangle number loop

				System.out.print(j + " ");
			}
			for (int x = rows - 1; x >= i; x--) { // Second triangle number loop
				System.out.print(x + " ");
			}

			System.out.println();
		}
		sc.close();
	}

}
