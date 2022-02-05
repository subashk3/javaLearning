package excersie;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfcylinder {

	static float areaOfcylinder(int r, int h) {
		return (float) (2 * (Math.PI) * r * (r + h));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int radius, height;
		//float area;

		System.out.println("Enter the radius of cylinder:");
		radius = sc.nextInt();
		System.out.println("Enter the height of cylinder:");
		height = sc.nextInt();
		// area =(float) (2 * ( Math.PI) * radius * (radius+ height));

		System.out.println("Area of cylinder is: " + areaOfcylinder(radius, height));
		sc.close();
	}

}
