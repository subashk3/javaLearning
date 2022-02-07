//Program to Find Factorial of a Number
package excersie;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int getNum = sc.nextInt();
		System.out.println("Factroial of give number is: "+ factorialNum(getNum));

	}

	static int factorialNum(int a) {
		int factNum = 1;
		for (int i = 1; i <= a; i++) {

			factNum = factNum * i;
		}
		return factNum;
	}

}
