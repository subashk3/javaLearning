package miniproject;

import java.io.*;
import java.util.Scanner;

public class EntryForm {
	public static void enterData() throws IOException {

		Scanner sc = new Scanner(System.in);

		FileWriter file = new FileWriter("C:\\Users\\Jana\\Desktop\\Files\\details.txt", true);
		BufferedWriter bf = new BufferedWriter(file);
		PrintWriter pr = new PrintWriter(bf);

		GetDetails get = new GetDetails();
		System.out.println("Enter name ");
		get.setName(sc.nextLine());
		System.out.println("Enter age ");

		get.setAge(sc.nextInt());

		System.out.println("Enter Mobile Number ");
		get.setMobNumber(sc.next());

		pr.print(get.getName() + " ");

		pr.print(get.getAge() + " ");

		pr.print(get.getMobNumber() + " ");
		pr.println();
		pr.flush();
		pr.close();
		System.out.println("Add more press :1");
		System.out.println("Exit press :2");
		if (sc.nextByte() == 1) {
			enterData();
		} else {
			System.out.println("Thank you for visiting..");
		}

	}

	public static void main(String[] args) throws IOException {

		enterData();

	}

}
