package com.hackerrank;

import java.util.Scanner;

public class PickingNumbers {
	public static int pickingNumbers(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = Math.abs(a[i] - a[j]);
				if (temp <= 1) {
					count++;
				}		
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println(pickingNumbers(a));
	}

}
