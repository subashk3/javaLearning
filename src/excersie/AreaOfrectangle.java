//13) Write a program to find the area of the rectangle
package excersie;

import java.util.Scanner;

public class AreaOfrectangle {

	static int areaOfRectangle(int l, int w) {

		return l * w;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, width; // area;
		System.out.println("Enter the length: ");
		length = sc.nextInt();
		System.out.println("Enter the height: ");
		width = sc.nextInt();

		//area = length * width;
		System.out.println("Area of Rectangle is " + areaOfRectangle(length, width));
		sc.close();
	}

}
