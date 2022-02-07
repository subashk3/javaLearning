package testprograms;

import java.util.Scanner;

public class Teee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// test programs

		int[][] a = new int[2][2];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				a[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println(a[i][j]+ " ");
			}
		}

	}

}
