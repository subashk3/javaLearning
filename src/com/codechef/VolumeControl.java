/*Chef is watching TV. The current volume of the TV is X. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. Chef wants to change the volume from X to Y. Find the minimum number of button presses required to do so.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X and Y - the initial volume and final volume of the TV.
Output Format
For each test case, output the minimum number of times Chef has to press a button to change the volume from X to Y.

Constraints
1≤T≤100
1≤X,Y≤100
Sample Input 1 
2
50 54
12 10
Sample Output 1 
4
2*/
package com.codechef;

import java.util.Scanner;

public class VolumeControl {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		while (t-- > 0) {

			int x = in.nextInt();
			int y = in.nextInt();

			int ans = Math.abs(x - y);
			System.out.println(ans);

		}
		in.close();
	}

}
