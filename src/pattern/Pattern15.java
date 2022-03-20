/*Enter the number of rows: 
5
* * * * * 
  *     * 
    *   * 
      * * 
        *
 */
package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int k = i; k < n; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == 1 || i == n || i == j || j == n || j == 1) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
