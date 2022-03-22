/*+-------+------------+----------------------+
| empId | name       | email                |
+-------+------------+----------------------+
|     1 | Subash K   | subash@gamil.com     |
|     2 | Siva       | siva@gamil.com       |
|     3 | Narendaran | narendaran@gamil.com |
+-------+------------+----------------------+*/
package dbms;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<PersonInfo> list = new ArrayList<PersonInfo>();

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");//connect driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");// get connection form our db;
			Statement st = con.createStatement();// create statement 
			String str = "select * from mytable";
			ResultSet rs = st.executeQuery(str);//Execute Query 
			//System.out.println(rs);
			while (rs.next()) {
				PersonInfo person = new PersonInfo();
				person.setEmpID(rs.getInt(1));
				person.setName(rs.getString(2));
				person.setEmail(rs.getString(3));
				list.add(person);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (PersonInfo get : list) {
			System.out.println("Employee ID     : " + get.getEmpID());
			System.out.println("Employee Name   : " + get.getName());
			System.out.println("Employee Mail ID: " + get.getEmail() + "\n");

		}

	}

}
