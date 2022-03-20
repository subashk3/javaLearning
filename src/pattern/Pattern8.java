/*Enter the number of rows:
 
5
* 
* * 
* * * 
* * * * 
* * * * * 

*/
package pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		String s = "* ";
		for (int i = 1; i <= n; i++) {
			System.out.print(s);
			s += "* ";
			if (!(i == n))
				System.out.println();
		}
	}

}
