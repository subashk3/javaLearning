/*
1. Simple Calculator
Given a string s which represents an expression, evaluate this expression and return its value. 
The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
Example:
Input: s = "3+2*2"
Output: 7
*/
package daily.program;

import java.util.*;

public class SimpleCalculator {

	private int calculate(String number) {
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char operator = '+';
		int len = number.length();
		int result = 0;

		for (int i = 0; i < len; i++) {
			char temp = number.charAt(i);
			
			if (Character.isDigit(number.charAt(i))) {
				num = num * 10 + Character.getNumericValue(temp);
			}
			
			if (!Character.isDigit(number.charAt(i)) && temp != ' ' || i == len - 1) {
				if (operator == '+') {
					stack.push(num);
				}
				if (operator == '-') {
					stack.push(-num);
				}
				if (operator == '*') {

					stack.push(stack.pop() * num);
				}
				if (operator == '/') {

					stack.push(stack.pop() / num);
				}
				operator = number.charAt(i);
				num = 0;
			}
		}
//System.out.println(stack);
		for (int value : stack) {
			result += value;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String number = in.nextLine();
		SimpleCalculator o = new SimpleCalculator();
		System.out.println(o.calculate(number));
	}

}
