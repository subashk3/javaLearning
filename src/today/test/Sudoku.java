package today.test;

import java.util.Scanner;

public class Sudoku {
	Scanner in = new Scanner(System.in);
	int sudoku[][] = new int[9][9];

//checking row
	private boolean numberRow(int array[][], int number, int row) {

		for (int i = 0; i < 9; i++) {
			if (array[row][i] == number) {
				return true;
			}
		}
		return false;
	}

//Checking column
	private boolean numberColumn(int array[][], int number, int column) {
		for (int i = 0; i < 9; i++) {
			if (array[i][column] == number) {
				return true;
			}
		}
		return false;
	}

//Checking box of the sudoku
	private boolean checkBox(int array[][], int number, int row, int column) {
		int boxRow = row - row % 3;
		int boxColumn = column - column % 3;
		for (int i = boxRow; i < boxRow + 3; i++) {
			for (int j = boxColumn; j < boxColumn + 3; j++) {
				if (array[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isValidNumber(int array[][], int number, int row, int column) {
		return !numberColumn(array, number, column) && !numberRow(array, number, row)
				&& !checkBox(array, number, row, column);
	}

//Solution method
	private boolean solveNumber(int array[][]) {

		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (array[row][column] == 0) {
					for (int value = 1; value < 10; value++) {
						if (isValidNumber(array, value, row, column)) {
							array[row][column] = value;
							if (solveNumber(array)) {
								return true;
							}else {
								array[row][column] = 0;
							}
						}
					}
					return false;
				}
				
			}
		}
		return true;
	
	}

	private void printSudoku(int[][] array) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	private void startGame() {
		System.out.println("Enter the Matrix: \n");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = in.nextInt();
			}
		}
		if (solveNumber(sudoku)) {
			System.out.println("\nValid Input\n");
			printSudoku(sudoku);
		} else {
			System.out.println("Invalid Input\n");
			// printSudoku(sudoku);
		}
	}

	public static void main(String[] args) {
		Sudoku obj = new Sudoku();
		obj.startGame();
	}

}