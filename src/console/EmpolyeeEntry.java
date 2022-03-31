package console;

import java.util.Scanner;
import java.util.*;

public class EmpolyeeEntry {

	private ArrayList<GetData> al = new ArrayList<GetData>();
	//static ArrayInput fileInput = new ArrayInput();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		EmpolyeeEntry obj = new EmpolyeeEntry();
		while (true) {
			System.out.println(
					"Select choice:\n Press 1 add data \n Press 2 for search employees\n Press 3 Print All \n Press 4 Exit");
			try {
				int option = sc.nextInt();
				switch (option) {
				case 1:
					obj.addEntry();
					break;
				case 2:
					System.out.println("Search by Name: (1)\nSearch by EMPID: (2)");
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
		int flag = 1;

		for (GetData x : al) {
			if (x.getName().equalsIgnoreCase(name)) {
				System.out.println("\nName      :" + x.getName());
				System.out.println("EMP ID    :" + x.getEmpid());
				System.out.println("Gender    :" + x.getGender());
				System.out.println("Join Date :" + x.getJoinDate() + "\n");
				flag = 0;
				
			}
		}
		if (flag == 1) {
			System.out.println("No data found\n");
		}
	}

	private void printEmp() throws Exception {
		int i = 1;
		//ArrayList<GetData> temp = fileInput.getData();
		
		if (al.isEmpty()) {
			System.out.println("No data found\n");
			return;
		}
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
	private void searchEmp() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EMPID:");
		String empId = sc.nextLine();
//		ArrayList<GetData> temp = fileInput.getData();
		int flag = 1;
		for (GetData get : al) {
			if (get.getEmpid().equals(empId)) {
				System.out.println("\nName      :" + get.getName());
				System.out.println("EMP ID    :" + get.getEmpid());
				System.out.println("Gender    :" + get.getGender());
				System.out.println("Join Date :" + get.getJoinDate() + "\n");
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("No data found\n");
		}
	}
	private void addEntry() throws Exception {

		Scanner sc = new Scanner(System.in);
		GetData get = new GetData();
		System.out.println("Enter employee Name:");
		get.setName(sc.nextLine());
		System.out.println("Enter employee id:");
		get.setEmpid(sc.nextLine());
		System.out.println("Enter employee Gender:");
		get.setGender(sc.nextLine());
		System.out.println("Enter employee Join date (dd-mm-yyyy):");
		get.setJoinDate(sc.nextLine());
		al.add(get);
//		fileInput.setData(al);
		System.out.println("Sucessfully added..\n");

	}

}
