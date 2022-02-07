package excersie;

import java.util.Scanner;

public class PyramidPattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows;
		System.out.println("Enter you Number of Rows: ");
		rows = sc.nextInt();

		for (int i = rows; i >= 1; i--) {

			for (int k = rows - 1; k >= i; k--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
				
			}
			System.out.println();

		}

	}

}
