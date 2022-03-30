package surprise;

import java.util.Scanner;

public class ArrayProblem {

	public void printPair(int[] array, int k) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; i < array.length; j++) {
				if((array[i]+array[j])%k==0) {	
					System.out.println(array[i]+" "+array[j]);
				}
				
				
			}

		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

	}

}
