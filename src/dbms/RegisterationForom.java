package dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterationForom {
	Scanner in = new Scanner(System.in);
	DbMethod dbMethod = new DbMethod();
	ArrayList<PersonInfo> list = new ArrayList<PersonInfo>();

	public void run() throws Exception {
		System.out.println("(1) Add new user:");
		System.out.println("(2) Search users:");
		System.out.println("(3) Print all data:");
		System.out.println("(4) Delete all data:");
		System.out.println("(5) Exit:\n");
		int choice = in.nextInt();
		switch (choice) {

		case 1 -> {
			addUser();
		}
		case 2 -> {
			System.out.println("\n(1) Search By EMPID:");
			System.out.println("(2) Search By Name :");
			// Searching two ways
			int secondChoice = in.nextInt();
			switch (secondChoice) {
			case 1 -> {
				System.out.println("Enter Employee ID:");
				searchByEmployeeID(in.nextInt());
			}
			case 2 -> {
				System.out.print("\nEnter Name       :\n");
				in.nextLine();
				searchByName(in.nextLine());
			}

			}
		}
		case 3 -> {
			getUser();
		}
		case 4 -> {
			deleteTable();
		}
		case 5 -> {
			System.out.println("\nThank You...");
			System.exit(0);
		}
		}
	}

	private void searchByEmployeeID(int empId) throws Exception {

		
		Statement statement = dbMethod.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery("select * from mytable");
		boolean flag = false;
		while (resultSet.next()) {
			if (resultSet.getInt(1) == empId) {
				flag = true;
				System.out.println("\nEmployee ID     : ZSGS" + resultSet.getInt(1));
				System.out.println("Employee Name   : " + resultSet.getString(2));
				System.out.println("Employee Mail ID: " + resultSet.getString(3) + "\n");
				break;
			}
		}
		if (!flag) {
			System.err.println("No data found kindly check again...");
		}
		run();
	}

	private void searchByName(String name) throws Exception {
		
		Statement statement = dbMethod.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery("select * from mytable");
		boolean flag = false;
		while (resultSet.next()) {
			if (resultSet.getString(2).equalsIgnoreCase(name)) {
				flag = true;
				System.out.println("\nEmployee ID     : ZSGS" + resultSet.getInt(1));
				System.out.println("Employee Name   : " + resultSet.getString(2));
				System.out.println("Employee Mail ID: " + resultSet.getString(3) + "\n");
				break;
			}
		}
		if (!flag) {
			System.err.println("No data found kindly check again...");
		}
		run();
	}

	private void deleteTable() throws Exception {
		Connection con = dbMethod.getConnection();
		String string = "truncate mytable";
		PreparedStatement preparedStatement = dbMethod.getpStatement(string);
		preparedStatement.execute();
		con.close();
		System.out.println("Delete Successfully..\n");
		run();
	}

	private void getUser() throws Exception {
		Connection con = dbMethod.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from mytable");
		while (resultSet.next()) {
			PersonInfo person = new PersonInfo();
			person.setEmpID(resultSet.getInt(1));
			person.setName(resultSet.getString(2));
			person.setEmail(resultSet.getString(3));
			list.add(person);
		}
		con.close();
		if (list.isEmpty()) {
			System.out.println("No data present..\n");
		} else {
			for (PersonInfo get : list) {
				System.out.println("Employee ID     : ZSGS" + get.getEmpID());
				System.out.println("Employee Name   : " + get.getName());
				System.out.println("Employee Mail ID: " + get.getEmail() + "\n");
			}
		}
		list.clear();
		run();
	}

	private void addUser() throws Exception {
		Scanner in = new Scanner(System.in);
		Connection con = dbMethod.getConnection();
		String string = "insert into mytable (ename, e_email, mob_no) values(?,?,?)";
		PreparedStatement preparedStatement = dbMethod.getpStatement(string);
		System.out.println("Enter your Name:");
		preparedStatement.setString(1, in.nextLine());
		System.out.println("Enter your Email ID:");
		preparedStatement.setString(2, in.nextLine());
		System.out.println("Enter your Mobile Number:");
		preparedStatement.setString(3, in.nextLine());
		preparedStatement.execute();
		con.close();
		System.out.println("Added Sucessfully..\n");
		// in.close();
		run();
	}
}