package testprograms;

import java.util.Scanner;

public class TTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var x = scanner.next();
		scanner.close();
		System.out.println(x + 10);
	}

}
