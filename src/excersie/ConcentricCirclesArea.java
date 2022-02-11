//16) Given the radius of two concentric circle, find the area of the space between the circle 
package excersie;

import java.util.Scanner;

public class ConcentricCirclesArea {

	static float areaOfCircle(int a, int b) {

		return (float) Math.PI * ((a * a) - (b * b));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int firstCircleRadius, secondCircleRadius;
		System.out.println("Enter the outer circles radius: ");
		firstCircleRadius = sc.nextInt();
		System.out.println("Enter the inner circles radius: ");
		secondCircleRadius = sc.nextInt();
		System.out.println("Area of the Concentric Circles is: " + areaOfCircle(firstCircleRadius, secondCircleRadius));

		sc.close();
		Binary2Decimal.countNum(secondCircleRadius);
	}

}
