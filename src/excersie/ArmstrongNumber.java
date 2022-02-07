//Program to Check Armstrong Number e.g 153 = 1*1*1 + 5*5*5 + 3*3*3 
package excersie;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int getNum = sc.nextInt();
		checkArmstrong(getNum);

	}

	static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;

		} while (a != 0);

		return count;
	}

	static void checkArmstrong(int a) {

		int x, res = 0;
		int temp = a;
		int count = countNum(temp);
		System.out.println(count);

		while (a != 0) {

			x = a % 10;

			res = (int) (res + Math.pow(x, count));

			a = a / 10;
		}

		if (temp == res) {

			System.out.println(temp + " is Armstrong Number.");
		} else
			System.out.println(temp + " is Not Armstrong Number");

	}

}
