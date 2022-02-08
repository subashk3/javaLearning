//51.Program to Display Armstrong Number Between Two Intervals
package excersie;

import java.util.Scanner;

public class ArmstrongNumberTwoInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum;
		System.out.println("Enter 1st Number: ");
		firstNum = sc.nextInt();
		System.out.println("Enter 2st Number: ");
		secondNum = sc.nextInt();

		armstrongTwoInterval(firstNum, secondNum);
	}

//check armstrong
	static void checkArmstrong(int a) {
		int x, res = 0;
		int temp = a;
		int count = countNum(temp);
		while (a != 0) {
			x = a % 10;
			res = (int) (res + Math.pow(x, count));
			a = a / 10;
		}
		if (temp == res) {
			System.out.println(temp + " ");
		}
	}

	// count the digits
	static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;
	}

	// Loop and print number
	static void armstrongTwoInterval(int firstNum, int secondNum) {

		for (int i = firstNum; i <= secondNum; i++) {
			checkArmstrong(i);

		}

	}

}
