package excersie;

import java.util.Scanner;

public class AreaOfSqure {

	static float areaOfSquare(int a) {

		return a * a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int area, side;
		System.out.println("Enter the side of square:");
		side = sc.nextInt();
		area = side * side;
		System.out.println("Area of square is: " + area);
		// System.out.println("Area of square is: " + areaOfSquare(side));
		
		sc.close();
	}

}
