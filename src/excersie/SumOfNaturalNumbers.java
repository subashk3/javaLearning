//Program to Calculate the Sum of Natural Numbers
package excersie;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number of Natrual Number: ");
		int lastNum = sc.nextInt();
		int sumOfNum = 0;
		for (int i = 1; i <= lastNum; i++)
			sumOfNum += i;

		System.out.println("Sum of Natural Numbers " + sumOfNum);
	}

}
