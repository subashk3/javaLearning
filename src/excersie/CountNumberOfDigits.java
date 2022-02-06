//Program to Count Number of Digits in an Integer
package excersie;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers:");

		int getNum = sc.nextInt();
		System.out.println(countNum(getNum));
	}

	static int countNum(int a) {
		int count = 0;
		while (a != 0) {

			a = a / 10;
			count++;

		}

		return count;
	}

}
