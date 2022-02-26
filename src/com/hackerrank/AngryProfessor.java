package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Tow {

	/*
	 * Complete the 'angryProfessor' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER k 2. INTEGER_ARRAY a
	 */

	public static String angerPro(int a[], int n) {
		int l = a.length, minus = 0;
		for (int i = 0; i < l; i++) {
			if (a[i] <= 0) {
				minus++;
			}
		}
		if (n <= minus) {
			return "NO";
		} else {
			return "YES";
		}
	}

}

public class AngryProfessor {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int l = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[l];
			for (int j = 0; j < l; j++) {
				a[j] = sc.nextInt();
			}
			String k = Tow.angerPro(a, n);
			System.out.println(k);

		}
		sc.close();
	}
}
