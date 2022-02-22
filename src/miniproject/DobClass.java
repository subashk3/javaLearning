package miniproject;

import java.util.Scanner;

public class DobClass {
	
	public String get(DateOfBirth d) {// passing interface object

		System.out.println("Enter the DOB (DD-MM-YYYY):");
		Scanner sc = new Scanner(System.in);
		String s = d.getDob(sc.nextLine());
		return s;
	}

}
