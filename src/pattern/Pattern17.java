package pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("*");

		}

	}
}
