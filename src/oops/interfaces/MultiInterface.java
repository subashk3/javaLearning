package oops.interfaces;

import java.util.Scanner;

interface In1 {

	public String getName(String name);
}

interface In2 extends In1 {

	public int getAge(int age);
}

interface In3 extends In2 {

	public String getDOB(String dob);
}
public class MultiInterface implements In3 {
	String name;
	int age;
	String dob;
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
		System.out.println("Your age is: " + o.age);
		System.out.println("Your DOB is: " + o.dob);
		System.out.println("--------------------------------");
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
