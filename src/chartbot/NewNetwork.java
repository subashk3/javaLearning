package chartbot;

import java.lang.StackWalker.Option;
import java.util.Scanner;
import java.util.Stack;

class Selection { // POJO class
	private int choice;
	private int level;

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}

public class NewNetwork {
	Stack<Selection> stackList = new Stack<Selection>();
	Scanner in = new Scanner(System.in);

//Enum selections 
	enum IndexLevel {
		OPTION1("1. English"), OPTION2("2. தமிழ்"), OPTION3("0. Exit");

		private String string;

		IndexLevel(String string) {
			this.string = string;
		}

	}

// Level 2 Option
	enum EnglishOption {
		OPTION1("1. Balance"), OPTION2("2. Recharge"), OPTION3("3. My Account Info"), OPTION4("4. DTH"),
		OPTION5("9. Back");

		String string;

		EnglishOption(String string) {
			this.string = string;
		}
	}

	enum TamilOption {
		OPTION1("1. இருப்பு தொகை"), OPTION2("2. ரீசார்ஜ்"), OPTION3("3. உங்கள் விவரம்"), OPTION4("4. டிடிஎச்"),
		OPTION5("9. பின்செல்ல");

		String string;

		TamilOption(String string) {
			this.string = string;
		}
	}

//Level 3 

	enum BalanceEnglish {
		OPTION1("Your Plan is - 499/-"), OPTION2("9. Back");

		private String string;

		BalanceEnglish(String string) {
			this.string = string;
		}

	}

	enum BalanceTamil {
		OPTION1("Your Plan is - 499/-"), OPTION2("9. பின்செல்ல");

		private String string;

		BalanceTamil(String string) {
			this.string = string;
		}

	}

	public void printData(int level) {
		int lang = 0;
		if (level == 0) {
			System.out.println(IndexLevel.OPTION1.string);
			System.out.println(IndexLevel.OPTION2.string);
			System.out.println(IndexLevel.OPTION3.string);
		} else if (level == 1) {
			lang = stackList.peek().getChoice();

			if (lang == 1) {
				System.out.println(EnglishOption.OPTION1.string);
				System.out.println(EnglishOption.OPTION2.string);
				System.out.println(EnglishOption.OPTION3.string);
				System.out.println(EnglishOption.OPTION4.string);
				System.out.println(EnglishOption.OPTION5.string);
			} else {
				System.out.println(TamilOption.OPTION1.string);
				System.out.println(TamilOption.OPTION2.string);
				System.out.println(TamilOption.OPTION3.string);
			
				System.out.println(TamilOption.OPTION4.string);
				System.out.println(TamilOption.OPTION5.string);
			}
			

		} else if (level == 2){
			if (lang == 1) {
				System.out.println(BalanceEnglish.OPTION1.string);
				System.out.println(BalanceEnglish.OPTION2.string);				
			} else {
				System.out.println(BalanceTamil.OPTION1.string);
				System.out.println(BalanceTamil.OPTION2.string);

			}

		}

	}

	public void run() {

		int choice;
		printData(0);
		Selection myObject = new Selection();
		stackList.push(myObject);
		do {
			Selection newMyObject = new Selection();
			System.out.println("Enter your option");
			choice = in.nextInt();
			if (choice == 0) {
				System.out.println("Thank you visit again..");
				System.exit(0);
			} else if (choice == 9) {
				stackList.pop();
				if (stackList.isEmpty()) {
					System.out.println("Thank you visit again..");
					System.exit(0);
				}
				printData(stackList.peek().getLevel()); // for reverse option
			} else if (choice != 9) {
				newMyObject.setLevel(stackList.peek().getLevel() + 1);
				newMyObject.setChoice(choice);
				stackList.push(newMyObject);
				printData(stackList.peek().getLevel());
			}

		} while (choice != 0);

	}

	public static void main(String[] args) {
		NewNetwork obj = new NewNetwork();
		obj.run();
		
	}

}
