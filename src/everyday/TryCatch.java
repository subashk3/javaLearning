package everyday;

import java.util.Scanner;

public class TryCatch {

	public static void addNumber() {
		System.out.println("Enter addition the Number:");
		Scanner nc = new Scanner(System.in);
		try {
			int c = nc.nextInt();
			int d = nc.nextInt();

			System.out.println("Addition is : " + (c + d));
		} catch (Exception e) {

			System.out.println(e);
		}
	}

	public static void dividNum() {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			float res = a / b;
			System.out.println("Divid number is " + res);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		/*
		 * int firstnumber = 10, secondnumber = 0;
		 * 
		 * int divnum = 1;
		 */

		// divNum = firstNum / secondNum;

		/*
		 * try { divnum = firstnumber / secondnumber;
		 * 
		 * } catch (Exception e) {
		 * 
		 * System.out.println(e.getMessage()); }
		 * 
		 * System.out.println(divnum); System.out.println("End of try-catch");
		 */

		dividNum();
		addNumber();
	}

}
