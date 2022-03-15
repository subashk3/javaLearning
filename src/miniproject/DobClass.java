package miniproject;

import java.util.Scanner;

public class DobClass {
	int dob;
	/*
	 * public DobClass(DateOfBirth dateOfBirth) {
	 * System.out.println("Enter the DOB (DD-MM-YYYY):"); Scanner sc = new
	 * Scanner(System.in); dateOfBirth.getDob(sc.nextLine()); }
	 */

	public String get(DateOfBirth d) {// passing interface object

		System.out.println("Enter the DOB (DD-MM-YYYY):");
		Scanner sc = new Scanner(System.in);
		String s = d.getDob(sc.nextLine());
		sc.close();
		return s;
	}

}
