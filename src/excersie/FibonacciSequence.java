//Program to Display Fibonacci Sequence

package excersie;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of Fibonacci sequence: ");
		int count = sc.nextInt();
		fibonacciSequence(count);
	}

	static void fibonacciSequence(int a) {

		int x = 1, y = 0, fibonacci = 0;

		for (int i = 1; i <= a; i++) {
			System.out.print(fibonacci + " ");
			fibonacci = x + y;
			x = y;
			y = fibonacci;
		}

	}

}
