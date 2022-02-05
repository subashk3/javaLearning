package excersie;

public class PyramidPattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int rows = 9;
		
		for(int i=1; i<=rows; i++) {
			for(int k=i;k<rows;k++)
				System.out.print(" ");
			
			for(int j=1; j<=i;j++) 
				System.out.print(i +" ");
			
			System.out.println();
		}
		

	}

}
