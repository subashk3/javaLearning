package dbms;

import java.sql.*;
import java.util.Scanner;

public class DbConnection {

	public void connectDb() {
		
		// Class.forName("com.mysql.jdbc.Driver");
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");// connect driver

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");

			String string = "insert into mytable (ename, e_email, mob_no) values(?,?,?)";

			PreparedStatement pStatement = con.prepareStatement(string);

			// Execute Query
			while (true) {
				System.out.println("Enter your Name:");
				pStatement.setString(1, scanner.next());
				System.out.println("Enter your Email ID:");
				pStatement.setString(2, scanner.next());
				System.out.println("Enter your Mobile Number:");
				pStatement.setString(3, scanner.next());
				pStatement.execute();
				System.out.println("Added Sucessfully..\n");

				System.out.println("Add more press : 1");
				System.out.println("Exit press     : 2");
				int temp = scanner.nextInt();

				if (temp == 1) {
					continue;
				} else {
					break;
				}

			}
			scanner.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
