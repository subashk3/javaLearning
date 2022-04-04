/*
-----------------------

Input:

8 4 9 0 0 3 5 7 0
0 1 0 0 0 0 0 0 0
7 0 0 0 9 0 0 8 3
0 0 0 9 4 6 7 0 0
0 8 0 0 5 0 0 4 0
0 0 6 8 7 2 0 0 0
5 7 0 0 1 0 0 0 4
0 0 0 0 0 0 0 1 0
0 2 1 7 0 0 8 6 5
---------------------

Output:

8 4 9 1 6 3 5 7 2
3 1 5 2 8 7 4 9 6
7 6 2 4 9 5 1 8 3
1 5 3 9 4 6 7 2 8
2 8 7 3 5 1 6 4 9
4 9 6 8 7 2 3 5 1
5 7 8 6 1 9 2 3 4
6 3 4 5 2 8 9 1 7
9 2 1 7 3 4 8 6 5

*/
package today.test;

import java.util.Scanner;

public class Sudoku {
	Scanner in = new Scanner(System.in);
	int sudoku[][] = new int[9][9];

//checking row
	private boolean numberRow(int box[][], int number, int row) {
		for (int i = 0; i < 9; i++) {
			if (box[row][i] == number) {
				return true;
			}
		}
		return false;
	}
//Checking column
	private boolean numberColumn(int box[][], int number, int column) {
		for (int i = 0; i < 9; i++) {
			if (box[i][column] == number) {
				return true;
			}
		}
		return false;
	}
//Checking box of the sudoku
	private boolean checkBox(int box[][], int number, int row, int column) {
		int boxRow = row - row % 3;
		int boxColumn = column - column % 3;
		for (int i = boxRow; i < boxRow + 3; i++) {
			for (int j = boxColumn; j < boxColumn + 3; j++) {
				if (box[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isValidNumber(int box[][], int number, int row, int column) {
		return !numberColumn(box, number, column) && !numberRow(box, number, row)
				&& !checkBox(box, number, row, column);
	}

//Solution method
	private boolean solveNumber(int box[][]) {

		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (box[row][column] == 0) {
					for (int value = 1; value < 10; value++) {
						if (isValidNumber(box, value, row, column)) {
							box[row][column] = value;
							
							if (solveNumber(box)) {
								return true;
							}else {
								box[row][column] = 0;
							}
						}
					}
					return false;
				}
				
			}
		}
		return true;
	}

	private void printSudoku(int[][] box) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(box[i][j] + " ");
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