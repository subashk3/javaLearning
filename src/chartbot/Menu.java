package chartbot;

import java.util.*;
//import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Process process = new Process();

	public void menu() {

		while (true) {
			System.out.println("Welcome to customer care");
			System.out.println("1. For check balance ");
			System.out.println("2. For Select talk time plan ");
			System.out.println("3. For Select data plan ");
			System.out.println("4. For Complaint ");
			System.out.println("5. For exit ");
			try {
				byte option = sc.nextByte();
				switch (option) {

				case 1:
					System.out.println("Your Balance is : " + process.getBalance() + "\n");
					break;
				case 2:
					process.talkTimePlan();
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Key");
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println(e);

			}

		}

	}

}
