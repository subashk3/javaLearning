//55.Program to Check Prime or Armstrong Number Using User-defined method
package excersie;

import java.util.Scanner;

public class PrimeOrArmstrong {
//Checking Prime or Armstrong Number
	void primeArmstrong(int getnum) {
		// Object create form PrimeOrNot class
		PrimeOrNot obj = new PrimeOrNot();
		// Object create form ArmstrongNumber class
		ArmstrongNumber obj2 = new ArmstrongNumber();
		if (obj.checkPrime(getnum) == 1 && obj2.checkArmstrong(getnum) == 1) {
			System.out.println(getnum + "Give number is prime and armstrong number");
		} else if (obj.checkPrime(getnum) == 1) {
			System.out.println(getnum + "Give number is prime number");
		} else if (obj2.checkArmstrong(getnum) == 1) {
			System.out.println(getnum + "Give number is armstrong number");
		} else if (obj.checkPrime(getnum) != 1 && obj2.checkArmstrong(getnum) != 1) {
			System.out.println(getnum + "Give number is not prime and not armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int getnum = sc.nextInt();

	}
//check 
}
