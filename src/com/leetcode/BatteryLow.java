package com.leetcode;

import java.util.*;

public class BatteryLow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int X = sc.nextInt();

			if (X <= 15) {
				System.out.println("YES");

			} else
				System.out.println("NO");

		}
	}

}
