/*
HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 40)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Input
4
73
67
38
33

Output
75
67
40
33



*/
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
		sc.close();
		gradingStudents(a, n);
	}

}
