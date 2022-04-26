package workout;

import java.util.Scanner;

public class Number {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if (stringClone(number))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		in.close();
	}

	private boolean stringClone(int number) {
		String copy = Integer.toString(number);
		String result = "";
		boolean flag = true;
		int i = 0;
		int a = Character.getNumericValue(copy.charAt(i));
		while (flag && i < copy.length()) {
			result = "" + a;
			while (result.length() < copy.length()) {
				result += 2 * a;
				a = 2 * a;
			}
			if (!copy.equals(result)) {
				i++;
				if (i < copy.length() - 1) {
					a = Integer.parseInt(copy.substring(0, i + 1));
					result = "";
				} else if (i == copy.length() - 1) {
					return false;
				}
			} else {
				flag = false;
				break;
			}
		}
		if (copy.equals(result)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Number obj = new Number();
		obj.solve();
	}
}
