//Program to Find LCM of two Numbers
package excersie;

import java.util.Scanner;

public class LCM2Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enmter the two Number:");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();

		int commonDiv = 1;
		for (int i = 1; i <= firstNum; i++) {

			if (firstNum % i == 0 && secondNum % i == 0) {
				commonDiv =commonDiv* i;

			}

		}
		System.out.println("LCM is " + commonDiv);

	}

}
