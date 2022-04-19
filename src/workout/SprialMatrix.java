package workout;

import java.util.Scanner;

public class SprialMatrix {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		solution(n, m);
		in.close();
	}

	private void solution(int n, int m) {
		int[][] a = new int[n][m];
		int val = 1;
		for (int col = 0; col <= 3; col++) {
			a[0][col] = val++;
		}
		for (int row = 1; row <= 3; row++) {
			a[row][3] = val++;
		}
		for (int col = 3 - 1; col >= 0; col--) {
			a[3][col] = val++;
		}
		for (int row = 3; row >=1; row--) {
			a[row][0] = val++;
		}

	}

	public static void main(String[] args) {

		SprialMatrix obj = new SprialMatrix();
		obj.solve();
	}

}
