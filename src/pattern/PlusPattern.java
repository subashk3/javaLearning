package pattern;

public class PlusPattern {
	public static void plusPatter(String s) {

		int len = s.length();
		int mid = len / 2;

		for (int i = 0; i < len; i++) {
			//for space 
			for(int k=0;k<mid;k++) {
				
				System.out.print(" ");
			}
			
			for (int j = 0; j < len; j++) {
				System.out.print("* ");
				
			}
			for(int f = 0 ;f<mid;f++)
				System.out.println();
			System.out.println();
		}

	}

	public static void main(String[] args) {

		String getstr = "Subashk";

		plusPatter(getstr);
	}

}
