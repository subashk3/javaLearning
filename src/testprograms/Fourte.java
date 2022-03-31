package testprograms;
//package com.fourte;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Fourte {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scanner.nextInt();

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < 4; i++) {
			int j = i + 1;
			System.out.println("Enter Number : " + (j) + " number");
			linkedList.add(scanner.nextInt());
		}

		int condition = 4;
		int answer = 0;

		while (condition > 0) {
			System.out.println("Your Number :" + number);
			System.out.println("Your Option :" + linkedList);
			System.out.println("Enter Number Given Below :");
			int userOption = scanner.nextInt();

			System.out.println("Enter Your Operator\n '+' '-' '*' '/' Or Press '0' -> concat");
			String operator = scanner.next();
			switch (operator) {
			case "+":
				answer = answer + userOption;
				break;
			case "-":
				answer = answer - userOption;
				break;
			case "*":
				answer = answer * userOption;
				break;
			case "/":
				answer = answer / userOption;
				break;
			case "0":
				answer = (answer * 10) + userOption;
				break;

			default:
				break;
			}
			System.out.println("answer " + answer);
			int index = 0;
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i) == userOption) {
					index = i;
				}
			}

			linkedList.remove(index);

			condition--;
		}

	}
}


/*
 * class Front { Scanner in = new Scanner(System.in); // first Pages public void
 * firstPage() { System.out.println("Enter the Number Resultant Number:");
 * 
 * int resultantNumber = in.nextInt();
 * 
 * System.out.println("Enter your combination"); } //Get Operator public
 * HashMap<Integer, Character> opertorValues() { HashMap<Integer, Character>
 * operator = new HashMap<Integer, Character>(); operator.put(1, '(');
 * operator.put(2, '+'); operator.put(3, '-'); operator.put(4, '*');
 * operator.put(5, ')'); return operator; } }
 */