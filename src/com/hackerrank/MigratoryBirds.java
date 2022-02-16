package com.hackerrank;

import java.util.Scanner;

public class MigratoryBirds {

	public static int migratoryBirds(int[] array) {

		int type[] = { 1, 2, 3, 4, 5 };
		int temp[] = new int[5];

		for (int i = 0; i < 5; i++) {// first type loops

			for (int j = 0; j < array.length; j++) {

				if (type[i] == array[j]) {

					temp[i] = temp[i] + 1;
				}
			}
		}

		
		int count = 0;

		for (int k = 0; k < 5; k++) {

			if (temp[k] == 1) {

				++count;
			} else if (temp[k] > 2) {
				if (temp[k] % 2 != 0) {
					++count;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
//		int n = 10;
//		int array[] = { 2, 4, 3, 2, 3, 1, 2, 1, 3, 3 };

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(migratoryBirds(array));

	}

}
