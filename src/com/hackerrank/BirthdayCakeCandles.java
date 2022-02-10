package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		return 0;
		// Write your code here

	}

}

public class BirthdayCakeCandles {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> candles = new ArrayList<>();

		for (int i = 0; i < candlesCount; i++) {
			int candlesItem = Integer.parseInt(candlesTemp[i]);
			candles.add(candlesItem);
		}

		int result = Result.birthdayCakeCandles(candles);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
