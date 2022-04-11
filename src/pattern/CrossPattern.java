package pattern;

import java.util.Scanner;

public class CrossPattern {
	public void crossPattern(String str) {

		int n = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (j == i) {
					System.out.print(str.charAt(i));
				} else if ((i + j) == str.length() - 1) {
					System.out.print(str.charAt(n));
				} else {

					System.out.print(" ");
				}
			}
			n--;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		CrossPattern o = new CrossPattern();
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		o.crossPattern(string);
	}

}
