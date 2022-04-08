/*
4. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example:
Input: nums = [-1,0,1,2,-1,-4]

*/
package daily.program;

import java.util.*;

public class Triplets {
	public void tripletFind(int[] array) {
		HashSet<ArrayList<Integer>> set = new HashSet<>();
		// int[] array = { -1, 0, 1, 2, -1, -4 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						ArrayList<Integer> arrayList = new ArrayList<>();
						arrayList.add(array[i]);
						arrayList.add(array[j]);
						arrayList.add(array[k]);
						Collections.sort(arrayList);
						set.add(arrayList);
					}
				}
			}
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = in.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = in.nextInt();
		}
		Triplets o = new Triplets();
		o.tripletFind(number);
	}

}
