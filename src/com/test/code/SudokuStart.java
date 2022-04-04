package com.test.code;

import java.util.Scanner;

public class SudokuStart {
	Scanner input = new Scanner(System.in);
	private int sudoku[][] = new int[9][9];

	// checking row
	public boolean inRow(int a[][], int row, int number) {
		for (int i = 0; i < 9; i++) {
			if (a[row][i] == number) {
				return true;
			}
		}
		return false;
	}

//Checking Column
	private boolean inColumn(int a[][], int column, int number) {
		for (int i = 0; i < 9; i++) {
			if (a[i][column] == number) {
				return true;
			}
		}
		return false;
	}
// Checking in Box

	private boolean inBox(int a[][], int row, int column, int number) {
		int boxRow = row - row % 3;
		int boxColumn = column - column % 3;
		for (int i = boxRow; i < boxRow + 3; i++) {
			for (int j = boxColumn; j < boxColumn + 3; j++) {
				if (a[i][j] == number) {
					return false;
				}
			}
		}
		return false;
	}

//Is valid
	private boolean isValid(int a[][], int row, int column, int number) {
		return !inRow(a, row, number) && !inColumn(a, column, number) && !inBox(a, row, column, number);
	}

	public boolean solve(int a[][]) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (a[i][j] == 0) {
					for (int value = 1; value < 10; value++) {
						if (isValid(a, i, j, value)) {
							a[i][j] = value;
							if (solve(a)) {
								return true;
							} else {
								a[i][j] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}

	private void printSudoku(int[][] arry) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}
	}

// Start the games
	public void startGame() {
		System.out.println("Enter the Matrix: \n");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = input.nextInt();
			}
		}
		if (solve(sudoku)) {
			System.out.println("\nValid Input\n");
			printSudoku(sudoku);
		} else {
			System.out.println("Invalid Input\n");
			// printSudoku(sudoku);
		}
	}

}
