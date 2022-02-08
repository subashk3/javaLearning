//28.Program to Find ASCII Value of a Character
package excersie;

import java.util.Scanner;

public class ASCIIValueChar {

	static void valueChar(char a) {
		int asValue;
		asValue = (int) a;
		System.out.println(asValue);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char reciValue = sc.next().charAt(0);

		valueChar(reciValue);
	}

}
