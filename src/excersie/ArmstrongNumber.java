//Program to Check Armstrong Number e.g 153 = 1*1*1 + 5*5*5 + 3*3*3 
package excersie;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArmstrongNumber obj = new ArmstrongNumber();
		System.out.println("Enter the Number: ");
		int getnum = sc.nextInt();
		int check = obj.checkArmstrong(getnum);
		if (check == 1) {
			System.out.println(getnum + " is Armstrong Number.");
		} else
			System.out.println(getnum + " is Not Armstrong Number");

	}

// checking count 
	static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;

		} while (a != 0);
		return count;
	}

//check armstrong or not	
	int checkArmstrong(int a) {
		int x, res = 0;
		int temp = a;
		int count = countNum(temp);

		while (a != 0) {
			x = a % 10;
			res = (int) (res + Math.pow(x, count));
			a = a / 10;
		}
		if (temp == res) {
			return 1;

		} else
			return 0;

	}

}
