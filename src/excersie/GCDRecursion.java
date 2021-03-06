//Program to Find G.C.D Using Recursion
package excersie;

import java.util.Scanner;

public class GCDRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Numbers:");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();

		System.out.println("" + gcdRecursion(firstNum, secondNum));

	}

	static int gcdRecursion(int firstNum, int secondNum) {
		if (secondNum != 0)
			return gcdRecursion(secondNum, firstNum % secondNum);
		else
			return firstNum;
	}
}
