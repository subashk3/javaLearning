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
		
		LinkedList<PersonInfo> list = new LinkedList<PersonInfo>();

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "12345");
			Statement st = con.createStatement();
			String str = "select * from mytable";
			ResultSet rs = st.executeQuery(str);
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
		/*
		 * for(PersonInfo get: list) { System.out.print(get.getEmpID()+" "+get.getName()
		 * +" "+get.getEmail());
		 * 
		 * }
		 */
		for (PersonInfo get : list) {
			System.out.println("Employee ID     : "+get.getEmpID());
			System.out.println("Employee Name   : "+get.getName());
			System.out.println("Employee Mail ID: "+get.getEmail()+"\n");
			
		}

	}

}
