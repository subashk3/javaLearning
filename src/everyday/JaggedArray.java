package everyday;

public class JaggedArray {

	public static void main(String[] args) {

		int jaggArray[][] = { { 1, 2, 3 }, { 3, 2 }, { 5, 4, 8, 7 }, { 1, 5, 8 } };

		for (int i = 0; i < jaggArray.length; i++) {

			for (int j = 0; j < jaggArray[i].length; j++) {

				System.out.print(jaggArray[i][j] + " ");
			}
			System.out.println(); 
		}

	}

}
