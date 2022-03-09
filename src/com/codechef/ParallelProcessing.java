package com.codechef;

import java.util.Scanner;

public class ParallelProcessing {
	public static void solve(int[] a,int total) {
		int temp = 0;
		int temp_total=total;

		for (int i = 0; i < a.length - 1; i++) {
			temp = a[i] + temp;
			int y = temp_total-temp;
			//System.out.println(temp);
			if (temp < y) {
				if (total > y) {
					total = y;
					// System.out.println(total);
				}
			} else {
				if (total > temp) {
					total = temp;
					break;
				}
			}

		}
		System.out.println(total);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int total=0;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
				total+=a[i];
			}
			// solution
			solve(a,total);

		}
	}
}
