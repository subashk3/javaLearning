package daily.program;

import java.util.HashMap;
import java.util.Scanner;

public class RomanInteger {
	public int romanToInt(String s) {
		s = s.toUpperCase();
		int result = 0;
		HashMap<Character, Integer> conditoin = new HashMap<Character, Integer>();
		conditoin.put('I', 1);
		conditoin.put('V', 5);
		conditoin.put('X', 10);
		conditoin.put('L', 50);
		conditoin.put('C', 100);
		conditoin.put('D', 500);
		conditoin.put('M', 1000);	
		for (int i = 0; i < s.length(); i++) {
			int firstNumber = conditoin.get(s.charAt(i));
			if (s.length() > i + 1) { //
				int secondNumber = conditoin.get(s.charAt(i + 1));
				if (firstNumber >= secondNumber) {
					result += firstNumber;
				}else {
					result+=(secondNumber-firstNumber);
					i++;
				}
			}else {
				result += firstNumber;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RomanInteger o = new RomanInteger();
		String s = sc.next();
		sc.close();
		System.out.println(o.romanToInt(s));

	}
}
