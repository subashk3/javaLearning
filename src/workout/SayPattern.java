/*
Input 
10
Output:
1
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
	
*/
package workout;
import java.util.Scanner;
public class SayPattern {
	private void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printPattern(n);
		in.close();
	}
	private void printPattern(int n) {
		String result = "1";
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				// System.out.println(result);
			} else {
				result = getString(result);
			}
		}
		System.out.println(result);
	}
	private String getString(String result) {
		String res = "";
		int i = 0, j = 1;
		int count = 1;
		while (i < result.length() && j < result.length()) {
			if (result.charAt(i) == result.charAt(j)) {
				count++;
				j++;
			} else {
				res += "" + count + result.charAt(i);
				count = 1;
				i = j;
				j++;
			}
		}
		res += "" + count + result.charAt(i);
		return res;
	}
	public static void main(String[] args) {
		SayPattern obj = new SayPattern();
		obj.solve();
	}

}
