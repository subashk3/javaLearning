//Conversion programs like km to Miles, centigrade to fahrenheit, sqft to acre etc..
package excersie;

import java.util.Scanner;

public class ConversionPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// km to mile conversion
		System.out.println("Enter the km:");
		float km = sc.nextFloat();
		float miles = (float) (km / 1.609);
		System.out.println(miles + " mile");

		// centigrade to fahrenheit

		System.out.println("Enter centigrade:");
		int ceti = sc.nextInt();
		float fahrenheit = (9 * ceti) / 5 + 32;
		System.out.println(fahrenheit + " °F");

		// sqft to acre

		System.out.println("Enter the Acre: ");
		double acre = sc.nextInt();

		float sqft = (float) (acre * 43560);

		System.out.println(sqft + " square feet");

	}

}
