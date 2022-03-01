/*
3 2 2
3 4 5
1 2


*/

package com.hackerrank;

import java.util.Scanner;

public class Cc {
	public static int[] circularArrayRotation(int[] c, int k, int[] q) {

		int temp[] = new int[q.length];
		int i = 0;
		while (k > 0) {

			int t = c[i];
			c[i] = c[i + 1];
			c[i + 1] = t;
			i++;
			k--;
		}
		/*
		 * for(int s:c) System.out.print(s);
		 */
		for(int j=0; j<q.length;j++) {
			 
			temp[j]=c[q[j]];		
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {

		
			c[i] = sc.nextInt();
			
		}
		
		
		
		int[] q = new int[m];
		for (int i = 0; i < m; i++) {

			q[i] = sc.nextInt();
		}
		int temp []=circularArrayRotation(c, k, q);
		for(int s:temp)
			System.out.println(s);
	}

}
