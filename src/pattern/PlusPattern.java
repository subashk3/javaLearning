package pattern;

public class PlusPattern {
	public static void plusPatter(String s) {

		int len = s.length();
		int mid = len / 2;

		for (int i = 0; i < len; i++) {
			//for space 
			
			for (int j = 0; j < len; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		String getstr = "Subashk";

		plusPatter(getstr);
		System.out.println("Hello");
	}

}
