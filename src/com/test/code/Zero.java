package com.test.code;

import java.util.Scanner;

public class Zero {
	Scanner in = new Scanner(System.in);
	private void zeroEnd(int a[]) {
		int len = a.length - 1;
		int i = 0, j = len;
		while (i < j) {
			if (a[j] > 0 && a[i] == 0) {
				a[i] = a[j];
				a[j] = 0;
				i++;
				j--;
			} else {
				if (a[i] > 0) {   
					i++;
				} else if (a[j] == 0) {
					j--;
				}
			}
		}
		for (int val : a) {
			System.out.print(val + " ");
		}
	}
	private void getArray() {
		System.out.println("");
		int size = in.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++)
			a[i] = in.nextInt();
		in.close();
		zeroEnd(a);
	}

	public static void main(String[] args) {
		Zero o = new Zero();
		o.getArray();

	}

}
