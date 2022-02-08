//68.Program to Multiply two Matrices by Passing Matrix to a Function
package excersie;

import java.util.Scanner;

public class PassingMatrix {
	// Matrix Muplitply
	static void matrixMuplitply(int[][] firstMatrix, int[][] secondMatrix, int fmRow, int fmCol, int smRow, int smCol) {
		Scanner in = new Scanner(System.in);
		// Result Matrix initialize
		int[][] resulMatrix = new int[fmRow][smCol];
		// Getting matrix loop
		System.out.println("Enter firstMatrix");
		for (int i = 0; i < fmRow; i++) {
			for (int j = 0; j < fmCol; j++) {
				firstMatrix[i][j] = in.nextInt();
			}
		}
		System.out.println("Enter Second tMatrix");

		// Getting matrix loop
		for (int i = 0; i < smRow; i++) {
			for (int j = 0; j < smCol; j++) {
				secondMatrix[i][j] = in.nextInt();
			}
		}
		System.out.println();
		// Multipy loops
		for (int i = 0; i < fmRow; i++) {
			for (int j = 0; j < fmCol; j++) {
				for (int k = 0; k < smRow; k++) { // Multiply and addition
					resulMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		System.out.println("Result is :");
		for (int i = 0; i < fmRow; i++) {
			for (int j = 0; j < smCol; j++) {
				System.out.print(resulMatrix[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] firstMatrix;
		int[][] secondMatrix;
		int frow, fcol, srow, scol;
		System.out.println("Enter the Number of 1 st matrix rows:");
		frow = sc.nextInt();
		System.out.println("Enter the Number of 1 st matrix  col:");
		fcol = sc.nextInt();
		System.out.println("Enter the Number of 2 st matrix rows:");
		srow = sc.nextInt();
		System.out.println("Enter the Number of 2 st matrix  col:");
		scol = sc.nextInt();
		sc.close();

		// ResulMatrix = new int[frow][scol];
		// PassingMatrix obj = new PassingMatrix();

		if (fcol == srow) {
			firstMatrix = new int[frow][fcol];
			secondMatrix = new int[srow][scol];
			matrixMuplitply(firstMatrix, secondMatrix, frow, fcol, srow, scol);
		} else
			System.out.println("This matrix unable to Multiply");
	}
}
