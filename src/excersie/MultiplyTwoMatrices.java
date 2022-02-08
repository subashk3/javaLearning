//66.Program to Multiply Two Matrices Using Multi-dimensional Arrays
package excersie;

import java.util.Scanner;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] firstMatrix;
		int[][] secondMatrix;
		int[][] resulMatrix;
		int frow, fcol, srow, scol;
		System.out.println("Enter the Number of 1 st matrix rows:");
		frow = sc.nextInt();
		System.out.println("Enter the Number of 1 st matrix  col:");
		fcol = sc.nextInt();
		System.out.println("Enter the Number of 2 st matrix rows:");
		srow = sc.nextInt();
		System.out.println("Enter the Number of 2 st matrix  col:");
		scol = sc.nextInt();
		firstMatrix = new int[frow][fcol];
		secondMatrix = new int[srow][scol];
		resulMatrix = new int[frow][scol];

		if (fcol == srow) {

			System.out.println("Enter firstMatrix");
			for (int i = 0; i < frow; i++) {
				for (int j = 0; j < fcol; j++) {
					firstMatrix[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Second tMatrix");
			for (int i = 0; i < srow; i++) {
				for (int j = 0; j < scol; j++) {
					secondMatrix[i][j] = sc.nextInt();
				}
			}

			System.out.println();
			for (int i = 0; i < frow; i++) {
				for (int j = 0; j < fcol; j++) {
					for (int k = 0; k < srow; k++) { // Multiply and addition
						resulMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

					}
				}
			}
			System.out.println("Resu is :");
			for (int i = 0; i < frow; i++) {
				for (int j = 0; j < scol; j++) {
					System.out.print(resulMatrix[i][j] + " ");
				}
				System.out.println();
			}
		} else
			System.out.println("This matrix unable to Multiply");
	}

}
