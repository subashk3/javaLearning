package miniproject;

import java.util.Scanner;

public class RegisterClass implements DateOfBirth{
	String emp_name;
	int empid;
	String dob;

	public void enterForm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		emp_name = sc.nextLine();
		System.out.println("Enter the empid:");
		empid = sc.nextInt();
		sc.close();
		DobClass obj = new DobClass();
		dob = obj.get(this);
		
		/*
		 * dob = obj.get(new DateOfBirth() {
		 * 
		 * @Override public String getDob(String dob) {
		 * 
		 * return dob; }
		 * 
		 * });
		 */
		
	}

	public void printForm() {
		System.out.println("Your Name: " + emp_name);
		System.out.println("Your id  : " + empid);
		System.out.println("Your DOB : " + dob);
	}

	public static void main(String[] args) {
		RegisterClass o = new RegisterClass();
		o.enterForm();
		o.printForm();

	}

	@Override
	public String getDob(String dob) {
		return dob; 
	}

//Interface method
	/*
	 * static DateOfBirth d = new DateOfBirth() {
	 * 
	 * @Override public String getDob(String dob) {
	 * 
	 * return dob; }
	 * 
	 * };
	 */
}
