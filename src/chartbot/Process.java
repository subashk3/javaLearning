package chartbot;

import java.util.Scanner;

public class Process {
	private float balance;
	Scanner sc = new Scanner(System.in);
	Menu obj = new Menu();

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void talkTimePlan() {
		System.out.println("Press 1: " + "Rs. 719 - Voice : Unlimited | Data: 2GB/per day | Validity: 84 days");
		System.out.println("Press 2: " + "Rs. 666 - Voice : Unlimited | Data: 1.5GB/per day | Validity: 84 days");
		System.out.println("Press 3: " + "Rs. 239 - Voice : Unlimited | Data: 1.5GB/per day | Validity: 28 days");
		System.out.println("Press 4: " + "Back to Main menu");
		byte option = sc.nextByte();
		switch (option) {

		case 1:
			setBalance(719);
			break;
		case 2:
			setBalance(666);
			break;

		case 3:
			setBalance(239);
			break;

		case 4:
			obj.menu();
			break;

		}

	}

}
