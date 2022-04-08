package com.test.code;

import java.util.*;

public class FourteGame {
	private void arithmaticGame() {
		Scanner sc = new Scanner(System.in);
		
		String[] operators = { "+", "*", "-", "/" };
		int numbers[] = new int[4];
		System.out.println("Enter 4 Values");
		
		for (int i = 0; i < 4; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int maxEnc = 1;
		
		for (int i = 0; i < numbers.length - 1; i++)
			maxEnc *= operators.length;

		int[] digits = new int[operators.length];
		
		int tmp;
		for (int i = 0; i < maxEnc; i++) {
			tmp = i;

			for (int j = 0; j < operators.length; j++) {
				digits[j] = tmp % operators.length;
				tmp /= operators.length;
			}
			String result = "";
			for (int j = 0; j < numbers.length - 1; j++)
				result += numbers[j] + operators[digits[j]];
			result += numbers[numbers.length - 1];
			System.out.println(result);
		}
		
	}

	public static void main(String[] args) {
		FourteGame game = new FourteGame();
		game.arithmaticGame();

	}
}
