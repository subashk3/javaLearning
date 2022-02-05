package excersie;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int enterNum = sc.nextInt();
		
		if(enterNum%2==0)
			System.out.println(enterNum+ " is Even.");
		else
			System.out.println(enterNum+ " is odd.");
	}

}
