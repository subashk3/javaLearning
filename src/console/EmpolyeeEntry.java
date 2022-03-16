package console;

import java.util.Scanner;
import java.util.*;

public class EmpolyeeEntry {

	ArrayList<GetData> al = new ArrayList<GetData>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmpolyeeEntry obj = new EmpolyeeEntry();
		while (true) {
			System.out.println(
					"Select choice:\n Press 1 add data \n Press 2 for search employees\n Press 3 Print All\n Press 4 Exit");
			try {
				int option = sc.nextInt();

				switch (option) {

				case 1:
					obj.addEntry();
					break;
				case 2:
					System.out.println("Serach by Name: (1)\nSearch by EMPID: (2)");
					try {
						int choice = sc.nextInt();
						switch (choice) {
						case 1:
							obj.searchName();
							break;

						case 2:
							obj.searchEmp();
							break;

						}
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				case 3:
					obj.printEmp();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invaild entry");
					break;

				}
			} catch (InputMismatchException e) {
				System.out.println(e);
				break;

			}
		}

	}

	private void searchName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		for (GetData x : al) {
			if (x.getName().equalsIgnoreCase(name)) {
				System.out.println("\nName      :" + x.getName());
				System.out.println("EMP ID    :" + x.getEmpid());
				System.out.println("Gender    :" + x.getGender());
				System.out.println("Join Date :" + x.getJoinDate() + "\n");
			}
		}
	}

	private void printEmp() {
		int i = 1;
		for (GetData x : al) {
			System.out.println("Detail " + (i++));
			System.out.println();
			System.out.println("\nName      :" + x.getName());
			System.out.println("EMP ID    :" + x.getEmpid());
			System.out.println("Gender    :" + x.getGender());
			System.out.println("Join Date :" + x.getJoinDate());
			System.out.println();
		}

	}

	private void searchEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EMPID:");
		String employeeName = sc.nextLine();
		for (GetData get : al) {
			if (get.getEmpid().equals(employeeName)) {
				System.out.println("\nName      :" + get.getName());
				System.out.println("EMP ID    :" + get.getEmpid());
				System.out.println("Gender    :" + get.getGender());
				System.out.println("Join Date :" + get.getJoinDate() + "\n");
			}
		}
	}

	private void addEntry() {

		Scanner sc = new Scanner(System.in);
		GetData o = new GetData();
		System.out.println("Enter employee Name:");
		o.setName(sc.nextLine());
		System.out.println("Enter employee id:");
		o.setEmpid(sc.nextLine());
		System.out.println("Enter employee Gender:");
		o.setGender(sc.nextLine());
		System.out.println("Enter employee Join date (dd-mm-yyyy):");
		o.setJoinDate(sc.nextLine());
		al.add(o);
		System.out.println("Sucessfully added..");

	}

}
