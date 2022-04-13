/*Given a sorted array arr[] with possibly duplicate elements, write a program to find indexes of first and last occurrences of target element in the given array.
	
	Problem Note 
		-The algorithm's runtime complexity must be in the order of O(log n)
		-If the target is not found in the array, return [-1, -1]
	Example 
		Input: arr[] = [1, 3, 5, 5, 5, 5, 28, 37, 42], target = 5
		Output: [2, 5]
		Explanation: First Occurrence = 2 and Last Occurrence = 5
		9
		1 3 5 5 5 5 28 37 42
		*/
package com.algorithm;
import java.util.Scanner;
public class FirstLast {
	// first
	public int firstOccurrence(int[] number, int target) {
		int first = -1;
		int start = 0;
		int end = number.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == number[mid]) {
				first = mid;
				end = mid + 1;
			} else if (number[mid] > target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return first;
	}

// second
	public int lastOccurrence(int[] number, int target) {
		int last = -1;
		int start = 0;
		int end = number.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == number[mid]) {
				last = mid;
				start = mid - 1;
			} else if (number[mid] > target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return last;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Array Length:");
		int len = in.nextInt();
		int number[] = new int[len];
		System.out.println("Enter the array");
		for (int i = 0; i < len; i++) {
			number[i] = in.nextInt();
		}
		int target = in.nextInt();
		in.close();
		
		FirstLast o = new FirstLast();

		System.out.println(o.firstOccurrence(number, target));
		System.out.println(o.lastOccurrence(number, target));
	}

}
