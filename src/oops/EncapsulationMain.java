/*Encapsulation is wrapping the data (variables) and code acting on the data (methods) together as a single unit*/
package oops;

import java.util.Scanner;

public class EncapsulationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Encapsulation user1 = new Encapsulation();
		int n = 1;
		while (n != 4) {

			System.out.println("--------------------------");

			System.out.println("1. Check your balance : ");
			System.out.println("2. Deposit Money : ");
			System.out.println("3. Check user maintain Minmum Balance : ");
			System.out.println("4.Exit ");

			System.out.println("--------------------------");
			n = sc.nextInt();
			switch (n) {

			case 1:
				System.out.println("Your account balance is: Rs." + user1.getBalance());

				break;
			case 2:
				System.out.println("Enter the amount:");
				int amt = sc.nextInt();
				user1.setDeposit(amt);
				System.out.println("Sucessfully Deposit.");
				break;
			case 3:
				System.out.println("User shoud maintain minmum Rs." + user1.getMinbalance());

				break;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Your enter wrong Key Press again:");
				break;
			}

		}

	}

}
