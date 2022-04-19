package miniproject;

import java.util.*;

public class Employees {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employer[] namelist = new Employer[5];
		namelist[0] = new Employer("Raju", "Manger", 50000);
		namelist[1] = new Employer("Kumar", "Operator", 15000);
		namelist[2] = new Employer("Ram", "Operator", 15000);
		namelist[3] = new Employer("Suresh", "Helper", 10000);
		namelist[4] = new Employer("Raju", "Helper", 10000);
		sc.close();
	}

}
