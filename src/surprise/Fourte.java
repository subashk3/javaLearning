package surprise;

import java.util.*;

public class Fourte {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Character> operator = new ArrayList<Character>();
	ArrayList<Integer> numberList = new ArrayList<Integer>();

	private ArrayList<Character> getOperator() {
		this.operator.add('(');
		this.operator.add(')');
		
		this.operator.add('+');
		this.operator.add('-');
		this.operator.add('*');
		this.operator.add('/');
		return operator;

	}

	private void runGame() {

		while (true) {
			System.out.println("Enter integer value to calculate: ");
			int value = scanner.nextInt();
			System.out.println("Enter integer numbers to use (space-separated): ");

			for (int i = 0; i < 4; i++) {

				numberList.add(scanner.nextInt());
			}
			SolveAndPrint(numberList, value);

			System.out.println("More? (y/n) ");

			if (scanner.next().toLowerCase() != "y")
				break;

		}
	}

	private void SolveAndPrint(ArrayList<Integer> numberList, int targetValue) {

	}

	public static void main(String[] args) {
		Fourte o = new Fourte();

	}
}