package testprograms;

import java.util.Scanner;

public class TestAllPrograms {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = { 1, 2, 3, 4, 5, 6 };

		int[] b = new int[a.length];
		int j = 0;
		System.out.println("B array");
		for (int i = (a.length - 1); i >= 0; i--) {

			System.out.print(a[i] + " ");
			b[j] = a[i];
			++j;
		}

		System.out.println("\nB array");
		for (int i : b) {

			System.out.print(i + " ");

		}
	}
}