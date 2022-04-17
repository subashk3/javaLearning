package workout;
import java.util.Scanner;
public class Parentheses {
	private void solve() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = in.nextLine();
		correctPara(s);
		in.close();
	}
	private void correctPara(String s) {
		StringBuffer str = new StringBuffer(s);
		int open = 0, close = 0;

		for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
			if (s.charAt(i) == '(') {
				open++;
			} else if (s.charAt(i) == ')') {
				open--;
			}
			if (s.charAt(j) == ')') {
				close++;
			} else if (s.charAt(j) == '(') {
				close--;
			}
			
			if(open<0) {
				str.deleteCharAt(i);
			}
			if(close<0) {
				str.deleteCharAt(j);
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Parentheses o = new Parentheses();
		o.solve();
	}

}
