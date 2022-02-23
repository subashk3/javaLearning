package oops.interfaces;

import java.util.Scanner;

interface In1 {

	public String getName(String name);

	/*
	 * static void run() {
	 * 
	 * System.out.println("Static run method in In1"); }
	 */
}

interface In2 extends In1 {

	public int getAge(int age);

	/*
	 * static void run() {
	 * 
	 * System.out.println("Static run method in In2"); }
	 */
}

interface In3 extends In2 {

	/*
	 * class Temp{
	 * 
	 * static void call() {
	 * 
	 * System.out.println("New one"); }
	 * 
	 * }
	 */

	public String getDOB(String dob);
	/*
	 * static void run() {
	 * 
	 * System.out.println("Static run method in In3"); }
	 */
}

public class MultiInterface implements In3 {
	String name;
	int age;
	String dob;

	static void run() {

		System.out.println("Static run method in class");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiInterface o = new MultiInterface();

		System.out.println("Enter the name :");
		o.getName(sc.nextLine());
		System.out.println("Enter age: ");
		o.getAge(sc.nextInt());
		System.out.println("Enter DOB: ");

		o.getDOB(sc.next());
		System.out.println("--------------------------------");
		System.out.println("Your name is: " + o.name);
		System.out.println("Your age is : " + o.age);
		System.out.println("Your DOB is : " + o.dob);
		System.out.println("--------------------------------");

		// static keywod in interface
		/*
		 * In1.run(); In2.run(); In3.run(); MultiInterface.run();
		 */

		// inner class concept
		// In3.Temp obj = new In3.Temp();
		// In3.Temp.call();

	}

	@Override
	public String getDOB(String dob) {
		// TODO Auto-generated method stub
		this.dob = dob;
		return dob;
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		return name;
	}

	@Override
	public int getAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
		return age;
	}
}
