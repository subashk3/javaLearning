/*Enter number of rows: 10
**********
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
**********

*/
package pattern;

import java.util.Scanner;

public class Pattern_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n || j == 1 || i == n || i == 1||j==i||(i+j)==(n+1)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		
		
		
	}
}
