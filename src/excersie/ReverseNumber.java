//Program to Reverse a Number
package excersie;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers:");

		int getNum = sc.nextInt();
		System.out.println(reverseNum(getNum));
	}
	static int reverseNum(int a) {
		int outNum = 0, temp;
		while (a != 0) {

			temp = a % 10;

			outNum = (outNum * 10) + temp;

			a = a / 10;

		}

		return outNum;
	}

}
