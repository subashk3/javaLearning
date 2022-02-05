package pattern;

import java.util.Scanner;

public class DoubleTriangle {

	public static void main(String[] args) {
		Scanner scanners = new Scanner(System.in);
		System.out.println("Enter Your rows: ");
		int n = scanners.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = i; k < n; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int k = i; k < n; k++)
				System.out.print(" ");
			for (int j = i; j >= 1; j--) {

				System.out.print("* ");
			}
			System.out.println();
		}
		scanners.close();
	}

}
