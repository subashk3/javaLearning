//Program to Find LCM of two Numbers
package excersie;

import java.util.Scanner;

public class LCM2Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enmter the two Number:");
		int firstnumber = sc.nextInt();
		int secondnumber = sc.nextInt();
		int lcm;

		// maximum number between firstNum and secondNum is stored in LCM

		if (firstnumber > secondnumber) {

			lcm = firstnumber;
		} else
			lcm = secondnumber;

		while (true) {
			if (lcm % firstnumber == 0 && lcm % secondnumber == 0) {
				System.out.printf("The LCM of %d and %d is %d.", firstnumber, secondnumber, lcm);
				break;
			}
			++lcm;
		}

	}

}
