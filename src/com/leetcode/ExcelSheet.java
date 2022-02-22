package com.leetcode;

import java.util.Scanner;

public class ExcelSheet {
	public int titleToNumber(String columnTitle) {
		int round = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			int result = (int) columnTitle.charAt(i);
			round = (round * 26) + (result - 64);
		}
		return round;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		ExcelSheet o = new ExcelSheet();
		System.out.println(o.titleToNumber(str));

	}

}
