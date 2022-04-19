package daily.program;

import java.util.Scanner;

public class Huff {
	private void solve() {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		getHuffman(num);
		in.close();
	}

	private void getHuffman(String num) {
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '0') {
				System.out.print((char) ('A' + count));
				count = 0;
			} else if (count == 3) {
				System.out.print((char) ('A' + count + 1));
				count = 0;
			} else {
				count++;
			}
		}

	}

	public static void main(String[] args) {
		Huff obj = new Huff();
		obj.solve();

	}

}
