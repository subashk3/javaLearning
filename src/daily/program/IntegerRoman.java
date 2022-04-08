/*
2. Integer to Roman 

Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

Example:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

*/
package daily.program;

import java.util.*;

public class IntegerRoman {
	public String intToRoman(int num) {
		int n;
		String result = "";
		if (num >= 1000) {
			n = num / 1000;
			while (n-- > 0) {
				result += "M";
			}
			num = num - (num / 1000 * 1000);
		}
		if (num >= 500) {
			if (num >= 900) {
				result += "CM";
				num -= 900;
			} else {
				result += "D";
				num -= 500;
			}
		}
		if (num >= 100) {
			if (num >= 400) {
				result += "CD";
				num -= 400;
			} else {
				n = num / 100;
				while (n-- > 0) {
					result += "C";
				}
				num = num - (num / 100 * 100);
			}
		}
		if (num >= 50) {
			if (num >= 90) {
				result += "XC";
				num -= 90;
			} else {
				result += "L";
				num -= 50;
			}
		}
		if (num >= 10) {
			if (num >= 40) {
				result += "XL";
				num -= 40;
			} else {
				n = num / 10;
				while (n-- > 0) {
					result += "X";
				}
				num = num - (num / 10 * 10);
			}
		}
		if (num >= 5) {
			if (num >= 9) {
				result += "IX";
				num -= 9;
			} else {
				result += "V";
				num -= 5;
			}
		}
		if (num >= 1) {
			if (num >= 4) {
				result += "IV";
				num -= 4;
			} else {
				while (num-- > 0) {
					result += "I";
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		IntegerRoman o = new IntegerRoman();
		System.out.println(o.intToRoman(num));
	}

}
