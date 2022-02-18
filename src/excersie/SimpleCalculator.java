//Program to Make a Simple Calculator Using switch
package excersie;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int f, s;
		char o;

		System.out.println("********This is calculator********");

		System.out.println("Enter the first Number:");
		f = sc.nextInt();

		System.out.println("Enter the second Number:");
		s = sc.nextInt();

		System.out.println("Enter the operator (+ - * / )");

		o = sc.next().charAt(0);
		sc.close();
		int res = calculator(f, s, o);

		System.out.println("Result is: " + res);

	}

	static int calculator(int a, int b, char c) {

		switch (c) {

		case '+':
			return a + b;

		case '-':
			return a - b;

		case '*':
			return a * b;

		case '/':
			return a / b;

		default:
			System.out.println("Enter Wrong Operator check again:");
			break;

		}
		return 0;

	}

}
