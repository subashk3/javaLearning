package everyday;

public class CloneOfArray {

	public static void main(String[] args) {
		
		
		int jaggArray[][] = { { 1, 2, 3 }, { 3, 2 }, { 5, 4, 8, 7 }, { 1, 5, 8 } };

		
		int  jaggArray1[][] =  jaggArray.clone();
		
		System.out.println(jaggArray1==jaggArray);
		
		
	}

}
