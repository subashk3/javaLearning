package com.hackerrank;

import java.util.Scanner;

public class GradingStudents {
//grade system

	public static void gradingStudents(int[] a, int count) {
		int temp;
		int result;
		for (int i = 0; i < a.length; i++) {

			temp = a[i] / 5;
			temp++;
			temp *= 5;
			result = temp - a[i];
			if (result < 3 && temp > 35) {
				a[i] = temp;
				
			}
			
		}
		for (int i = 0; i < count; i++) {

			System.out.println(a[i]);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}

		gradingStudents(a, n);
	}

}
