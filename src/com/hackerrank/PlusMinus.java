/*Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

e.g like this 

0.400000
0.400000
0.200000
*
*/
package com.hackerrank;

public class PlusMinus {

	public static void main(String[] args) {

		int arr[] = { -4, 3, -9, 0, 4, 1 };

		float arryLength = arr.length;

		float positiveCount = 0;
		float negativeCount = 0;
		float zeroCount = 0;
		for (int i = 0; i < arryLength; i++) {

			if (arr[i] > 0) {

				positiveCount++;
			} else if (arr[i] < 0) {

				negativeCount++;
			} else
				zeroCount++;
		}
		System.out.println(positiveCount / arryLength);
		System.out.println(negativeCount / arryLength);
		System.out.println(zeroCount / arryLength);

	}

}
