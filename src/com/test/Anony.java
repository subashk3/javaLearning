package com.test;

public class Anony {

	public static void main(String[] args) {

		System.out.println(sum(new int[] { 1, 5, 4 }));

	}

	private static int sum(int[] is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];

		}
		return sum;
	}

}
