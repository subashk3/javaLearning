package com.codechef;

import java.util.Scanner;

public class ChessboardDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int X1 = sc.nextInt();
			int Y1 = sc.nextInt();
			int X2 = sc.nextInt();
			int Y2 = sc.nextInt();
			
			/*
			 * int x = Math.abs(X1-X2); int y = Math.abs(Y1-Y2);
			 */
			
			System.out.println(Math.max(Math.abs(X1-X2), Math.abs(Y1-Y2)));
			
		}

	}

}
