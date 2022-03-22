package dbms;

import java.util.Scanner;

public class SampleDbms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tableName = "mytable";
		int empId = sc.nextInt();
		String empName = sc.next();
		String emailId = sc.next();

		String str = "insert into table " + tableName + " (" + empId + ", " + "\"" + empName + "\", " + "\"" + emailId
				+ "\")";
		System.out.println(str);

	}

}
