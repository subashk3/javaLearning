/*https://www.hackerrank.com/challenges/extra-long-factorials*/
package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void extraLongFactorials(int n) {
		
		BigInteger b = BigInteger.valueOf(1);
		
		for(int i=2;i<=n;i++) {
			
			b = b.multiply(b.valueOf(i));
		}

		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		extraLongFactorials(n);
	}

}
