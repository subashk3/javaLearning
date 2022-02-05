package everyday;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// Array is a collection of data
		Scanner sc = new Scanner(System.in);
		int ar[] = { 1, 2, 3, 4, 5 };

//		int[] av;
//		av = {1,23,3};
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);

		for (int r : ar)
			System.out.print(r + " ");

		System.out.println();

		// String array
//		String ar1[] = new String[4];

		// System.out.println("Enter the array one by one (Only 4) :");
		// for (int i = 0; i < ar1.length; i++) {
		// ar1[i] = sc.next();

		// }

		System.out.println();
		// for (String r : ar1)
		// System.out.print(r + " ");

		// 2D Array
		int twoDArr[][] = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };
		// print two Dimensional Array
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr.length; j++)
				System.out.print(twoDArr[i][j] + " ");
			System.out.println();

		}

	}

}
