//Program to Add Two Matrices Using Multi-dimensional Arrays
package excersie;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] firstMatrix;
		int[][] secondMatrix;
		int[][] resulMatrix;
		int row, col;
		System.out.println("Enter the Number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the Number of rows:");
		col = sc.nextInt();
		firstMatrix = new int[row][col];
		secondMatrix = new int[row][col];
		resulMatrix = new int[row][col];

		System.out.println("Enter firstMatrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second tMatrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				secondMatrix[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				resulMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];

			}
			}
		System.out.println("Resu is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(resulMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
