//Program to Find Transpose of a Matrix
package excersie;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] firstMatrix;
		int[][] TransposeMatrix;
		int row, col, trow, tcol;
		System.out.println("Enter the Number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the Number of col:");
		col = sc.nextInt();
		trow = col;
		tcol = row;

		firstMatrix = new int[row][col];
		TransposeMatrix = new int[trow][tcol];// collength

		System.out.println("Enter firstMatrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		for (int i = 0; i < trow; i++) {
			for (int j = 0; j < tcol; j++) {
				TransposeMatrix[i][j] = firstMatrix[j][i];
				System.out.print(TransposeMatrix[i][j] + " ");

			}
			System.out.println();
		}
		/*
		 * System.out.println("Transpose is :"); for (int i = 0; i < trow; i++) { for
		 * (int j = 0; j < tcol; j++) { System.out.print(TransposeMatrix[i][j] + " "); }
		 * System.out.println(); }
		 */

	}

}
