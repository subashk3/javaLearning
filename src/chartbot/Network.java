package chartbot;

import java.util.Scanner;
import java.util.Stack;

/* POJO CLASS */
class Choice { 
	private int level; 
	private int choice;

	public void setLevel(int level) {
		this.level = level;
	}

	public void setChoice(int choice) {
		this.choice = choice; 
	}

	public int getLevel() {
		return level;
	}

	public int getChoice() { 
		return choice;
	}
}


public class Network { 
	private Stack<Choice> stackList = new Stack<>();
	private Scanner in = new Scanner(System.in);


	enum Index { 
		OPTION1("1 - English"), OPTION2("2 - Tamil"), OPTION3("0 - exit");

		private String text; 

		Index(String text) { 
			this.text = text;
		}
	}

	enum EnglishIndex {
		OPTION1("1 - Recharge"), OPTION2("2 - Dth"), OPTION3("3 - Service"), OPTION4("9 - back"),
		OPTION5("0 - exit");

		private String text;

		EnglishIndex(String text) {
			this.text = text;
		}
	}

	
	enum TamilIndex {
		OPTION1("1 - ரிச்சார்ஜ்"), OPTION2("2 - டிடிஹச்"), OPTION3("3 -  சேவை "), OPTION4("9 - பின் செல்ல "),
		OPTION5("0 - exit");

		private String text;

		TamilIndex(String text) {
			this.text = text;
		}
	}
	enum Recharge {
		OPTION1("1 -  106. 1GB Data for 84 Days"), OPTION2("2 - 197. 2GB/DAY Data for 100 Days"),
		OPTION3("3 - ₹22 for 90 Days Pack"), OPTION4("9 - back"), OPTION5("0 - exit");

		private String text;

		Recharge(String text) {
			this.text = text;
		}
	}

	enum Dth {
		OPTION1("1 -  ₹100 for 50 Channels"), OPTION2("2 - ₹180 for 70 Channels"),
		OPTION3("3 - ₹216 for 88 Channels"), OPTION4("9 - back"), OPTION5("0 - exit");

		private String text;

		Dth(String text) {
			this.text = text;
		}
	}

	enum Service {
		OPTION1("1 -  Call 1001 for Recharge Complaint"), OPTION2("2 - Call 1002 for DTH Complaint"),
		OPTION3("9 - back"), OPTION4("0 - exit");

		private String text;

		Service(String text) {
			this.text = text;
		}
	}

	private void printDetails(int level) {
		if (level == 0) {
			System.out.println(Index.OPTION1.text);
			System.out.println(Index.OPTION2.text);
			System.out.println(Index.OPTION3.text);

		} else if (level == 1) {
			switch (stackList.peek().getChoice()) {
			case 1: 
				System.out.println(EnglishIndex.OPTION1.text);
				System.out.println(EnglishIndex.OPTION2.text);
				System.out.println(EnglishIndex.OPTION3.text);
				System.out.println(EnglishIndex.OPTION4.text);
				System.out.println(EnglishIndex.OPTION5.text);
				break;
			case 2:
				System.out.println(TamilIndex.OPTION1.text);
				System.out.println(TamilIndex.OPTION2.text);
				System.out.println(TamilIndex.OPTION3.text);
				System.out.println(TamilIndex.OPTION4.text);
				System.out.println(TamilIndex.OPTION5.text);
				break;
			}
		} else if (level == 2) {
			switch (stackList.peek().getChoice()) {
			case 1:
				System.out.println(Recharge.OPTION1.text);
				System.out.println(Recharge.OPTION2.text);
				System.out.println(Recharge.OPTION3.text);
				System.out.println(Recharge.OPTION4.text);
				System.out.println(Recharge.OPTION5.text);
				break;
			case 2:
				System.out.println(Dth.OPTION1.text);
				System.out.println(Dth.OPTION2.text);
				System.out.println(Dth.OPTION3.text);
				System.out.println(Dth.OPTION4.text);
				System.out.println(Dth.OPTION5.text);
				break;
			case 3:
				System.out.println(Service.OPTION1.text);
				System.out.println(Service.OPTION2.text);
				System.out.println(Service.OPTION3.text);
				System.out.println(Service.OPTION4.text);
				break;
			}
		} else {
			System.out.println("Operation Successfull");
			System.out.println("Visit again");
			System.exit(0);
		}
	}

	private void indexDetails() {
		byte choice;
		Choice choiceObj = new Choice();
		stackList.push(choiceObj);
		printDetails(stackList.peek().getLevel());
		do {
			Choice newChoiceObj = new Choice();
			System.out.println("Enter Your Choice");
			choice = in.nextByte();
			if (choice == 0) { 
				System.out.println("Thank you visit again..");
				System.exit(0);
			} else if (choice == 9) {
				stackList.pop();
				if (stackList.empty())
				{
					System.out.println("Thank you visit again..\nBye..");
					System.exit(0);
				}
				printDetails(stackList.peek().getLevel());
			} else if (choice != 9) {
				newChoiceObj.setChoice(choice);
				newChoiceObj.setLevel(stackList.peek().getLevel() + 1);
				stackList.push(newChoiceObj);
				printDetails(stackList.peek().getLevel());
			}
		} while (choice != 0);
	}
	

	public static void main(String args[]) {
		Network absNetwork = new Network();
		absNetwork.indexDetails();
	}
}
