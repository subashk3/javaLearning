/*

1 2 3 4 5
6 7 7 7 7
1 2 3 4 5
2 1 3 4 5
2 0 2 3 4



 */
package workout;

import java.util.Scanner;

public class LowerMatrix {
	private void solve() {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i <= j)
					a[i][j] = in.nextInt();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

	public static void main(String[] args) {
		LowerMatrix obj = new LowerMatrix();
		obj.solve();
	}
}
