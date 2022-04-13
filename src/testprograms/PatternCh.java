package testprograms;

public class PatternCh {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print("* ");
			}
			for (int k = 0; k < 2 * i; k++) {
				System.out.print("  ");
			}
			for (int z = 0; z <= n - i; z++) {
				System.out.print("* ");
			}
			if (i != n) {
				System.out.println();
			} 
				
		}
		/*
		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("@ ");
			}
			for (int k = 1; k < 2 * i; k++) {
				System.out.print("  ");
			}
			for (int z = 1; z <= n - i; z++) {
				System.out.print("@ ");
			}
			
				System.out.println();
			 
		}*/

	}
}
