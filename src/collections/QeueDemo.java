package collections;

import java.util.*;

class Temp {

	public String name;

}

public class QeueDemo {

	public static void prt(Temp o) {

		System.out.println(o.name);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Temp> al = new ArrayList<Temp>();
		/*
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * al.add(new Temp());
		 * 
		 * } prt(al.get(0));
		 * 
		 */
		int f = 0;
		while (f == 0) {

			System.out.println("1 add");
			System.out.println("2 exit");
			int n = sc.nextInt();

			switch (n) {
			case 1: {
				Temp o = new Temp();
				o.name = sc.nextLine();
				al.add(o);

				break;
			}
			case 2:
				f = 1;
				break;

			}

		}
		for (Temp x : al) {

			System.out.println(x.name);
		}

		
		
		String s = "11";
	System.out.println(Integer.parseInt(s));
	
		
	}

}
