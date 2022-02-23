package miniproject;

import java.util.Scanner;

public class RegisterClass1 {

	String name;
	int empid;
	String dob;

	public void enterForm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		this.name = sc.nextLine();
		System.out.println("Enter the empid:");
		this.empid = sc.nextInt();

		DobClass obj = new DobClass();

		//this.dob = obj.get(d);

	}
	public void printForm() {
		
		System.out.println("Your Name: "+this.name);
		System.out.println("Your id  : "+this.empid);
		System.out.println("Your DOB : "+this.dob);
	}

	public static void main(String[] args) {
		RegisterClass1 o = new RegisterClass1();
		o.enterForm();
		o.printForm();

	}
//Interface method
	static DateOfBirth d = new DateOfBirth() {

		@Override
		public void getDob(String dob) {
			
			RegisterClass1this.dob= dob;
		}

	};
}