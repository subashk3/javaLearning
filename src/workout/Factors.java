/*
2) To find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
Input:

Given array : 
5
8 2 3 12 16
Output:

12, 16, 8, 2, 3

*/
package workout;

import java.util.Scanner;

public class Factors {
	private void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; a[i++] = in.nextInt())
			;
		printDescending(a);
		in.close();
	}

	private void printDescending(int[] a) {
		for (int i = 0; i < a.length ; i++) {
			for (int j = 0; j < a.length; j++) {
				if (great(a[i], a[j])) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int val : a)
			System.out.print(val + " ");
	}
	private boolean great(int number1, int number2) {
		int c1 = 0, c2 = 0;
		for (int i = 2; i < number1 || i < number2; i++) {
			if (number1 % i == 0 && i < number1) {
				c1++;
			}
			if (number2 % i == 0 && i < number2) {
				c2++;
			}
		}
		
		System.out.println(number1 +" "+c1);
		System.out.println(number2 +" "+c2);

		return c1 > c2;
	}

	public static void main(String[] args) {
		Factors obj = new Factors();
		obj.solve();

	}

}
