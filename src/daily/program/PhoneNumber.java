package daily.program;

import java.util.Scanner;

public class PhoneNumber {
	private boolean checkPhoneNumber(String mobileNumber) {
		if (mobileNumber.length() != 10)
			return false;
		boolean isNumber = false;
		for (int i = 0; i < mobileNumber.length(); i++) {
			isNumber = false;
			if (i == 0 && !(mobileNumber.charAt(0) == '7') && !(mobileNumber.charAt(0) == '8')
					&& !(mobileNumber.charAt(0) == '9')) {
				return false;
			}
			if (Character.isDigit(mobileNumber.charAt(i))) {
				isNumber = true;
			}
		}
		if (isNumber) {
			return true;
		} else {

			return false;
		}

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PhoneNumber number = new PhoneNumber();
		System.out.println("Enter number");
		String mobileNumber = in.nextLine();
		System.out.println(number.checkPhoneNumber(mobileNumber));
	}

}
