/*Enter the number of rows: 
5
* * * * * 
  *       * 
    *       * 
      *       * 
        * * * * * */
package pattern;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int k = i; k > 1; k--) {
				System.out.print("  ");
			}

			for (int j = 1; j <= n; j++) {

				if (i == n || i == 1 || j == n || j == 1) {
					System.out.print("* ");
				} else
					System.out.print("  ");
				;
			}
			System.out.println();

		}
	}
}
