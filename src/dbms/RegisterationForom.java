package dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

///import com.mysql.cj.protocol.Resultset;

public class RegisterationForom {
	Scanner in = new Scanner(System.in);
	DbMethod dbMethod = new DbMethod();
	ArrayList<PersonInfo> list = new ArrayList<PersonInfo>();
	public void run() throws SQLException {
		System.out.println("(1) Add new user:");
		System.out.println("(2) Print all data:");
		System.out.println("(3) Delete all data:");
		System.out.println("(4) Exit:\n");
		int choice = in.nextInt();
		switch (choice) {

		case 1 -> {
			addUser();
		}
		case 2 -> {
			getUser();
		}
		case 3 -> {
			deleteTable();
		}
		case 4 -> {
			System.out.println("\nThank You...");
			System.exit(0);
		}
		}
	}
	private void deleteTable() throws SQLException {

		Connection con = dbMethod.getConnection();
		String string = "truncate mytable";
		PreparedStatement preparedStatement = dbMethod.getpStatement(string);
		preparedStatement.execute();
		con.close();		
		System.out.println("Delete Sucessfully..\n");
		run();
	}
	private void getUser() throws SQLException {
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
	private void addUser() throws SQLException {
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
		run();
	}
}
