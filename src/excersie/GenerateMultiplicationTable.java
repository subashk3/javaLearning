//Program to Generate Multiplication Table
package excersie;

import java.util.Scanner;

public class GenerateMultiplicationTable {

	static void generateTable(int a) {

		for (int i = 1; i <= 20; i++) {

			System.out.println(i + " x " + a + " = " + (a * i));

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number of Multiplication");
		int num = sc.nextInt();
		generateTable(num);

	}

}
