//Program to Check Whether a Number is Prime or Not (only divided same and 1)
package excersie;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeOrNot obj = new PrimeOrNot();
		System.out.println("Enter the number:");
		int getnum = sc.nextInt();
		int check =obj.checkPrime(getnum);
		
		if(check == 1) {
			
			System.out.println(getnum+ " is prime number.");
		}else
			System.out.println(getnum+ " is not a prime number.");
	}

	int  checkPrime(int getnumber) {
		int temp = 0;
		
		if (getnumber == 0 || getnumber == 1)
			System.out.println(getnumber + " the number not a prime number and composite.");

		for (int i = 2; i <= getnumber / 2; i++) {

			if (getnumber % i == 0) {
				temp = 1;
				break;
			}
		}
		if (temp == 0)
			return 1;	
		else
			return 0;
		
		

	}
}
