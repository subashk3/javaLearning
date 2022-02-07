//Program to Find the Roots of a Quadratic Equation
package excersie;

import java.util.Scanner;

public class RootsQuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of A:");
		double firstNum = sc.nextDouble();
		System.out.println("Enter Number of B:");
		double secondNum = sc.nextDouble();
		System.out.println("Enter Number of C:");
		double thirdNum = sc.nextDouble();

		quadraticEquation(firstNum, secondNum, thirdNum);

	}

	static void quadraticEquation(double a, double b, double c) {

		double discriminal = b * b - (4 * a * c);

		if (discriminal > 0) {

			double num1 = (-b + Math.sqrt(discriminal)) / (2 * a);
			double num2 = (-b - Math.sqrt(discriminal)) / (2 * a);

			System.out.println("Result values are: " + num1 + ", " + num2);

		} else if (discriminal == 0) {

			double num = -b / (2 * a);
			System.out.println("Result value is: " + num);
		} else {

			double temp1 = -b / (2 * a);
			double temp2 = (Math.sqrt((-b * b) - (4 * a * c))) / (2 * a);

			System.out.println("Result is : " + temp1 + "" + temp2 + "i");
		}

	}

}
