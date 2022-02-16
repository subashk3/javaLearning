/*https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

Sample Input 0

5
1 2 1 3 2

//0 1 2 3 4

3 2
Sample Output 0

2

*/
package com.hackerrank;

import java.util.Scanner;

public class SubarrayDivisiondiv {

	public static int birthday(int[] s, int d, int m) {
		int count = 0;

		for (int i = 0; i <= s.length - m; i++) {
			int sum = 0;
			for (int j = i; j < (i + m); j++) {
				sum += s[j];
			}
			if (sum == d) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] array) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(birthday(s, d, m));
	}
}