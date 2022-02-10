/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

*
*
*
link: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen*/


//10/15 test cases failed :(

package com.hackerrank;

import java.util.Scanner;

public class Mini_MaxSum {

	public static void miniMaxSum(int[] array) {

		int min = array[0];
		int max = array[0];
		int sumofarray = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];
			}
			if (array[i] < min) {

				min = array[i];
			}
			sumofarray += array[i];
		}
		System.out.println((sumofarray-max)+ " "+(sumofarray-min));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arry[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arry[i] = sc.nextInt();
		}

		miniMaxSum(arry);
	}

}
