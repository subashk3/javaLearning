package com.hackerrank;

import java.util.*;

public class ViralAdvertising {
	public static int viralAdvertising(int n) {

		int day = n;
		int m = 5;
		int like = 2;
		int c = 2;
		if (n > 1) {
			for (int i = 1; i < n; i++) {
				m = (m / 2) * 3;
				like = m / 2;
				c += like;				
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(viralAdvertising(n));
	}

}
