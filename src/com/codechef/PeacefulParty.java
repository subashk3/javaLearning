/*The mayor of your city has decided to throw a party to gather the favour of his people in different regions of the city.

There are 33 distinct regions in the city namely AA, BB, CC comprising of PAPA, PBPB and PCPC number of people respectively.

However, the mayor knows that people of the region BB are in conflict with people of regions AA and CC. So, there will be a conflict if people from region BB are present at the party along with people from region AA or CC.

The mayor wants to invite as many people as possible and also avoid any conflicts. Help him invite maximum number of people to the party.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first line of each test case contains three integers PAPA, PBPB and PCPC - number of people living in regions AA, BB and CC respectively.
Output Format
For each test case, output the maximum number of people that can be invited to the party.

Constraints
1≤T≤10001≤T≤1000
1≤PA,PB,PC≤10001≤PA,PB,PC≤1000
Sample Input 1 
3
2 3 4
1 5 2
8 8 8
Sample Output 1 
6
5
16
Explanation
Test case-1: Mayor can invite all the people from region AA and CC. So the maximum number of people invited is 66.

Test case-2: Mayor can invite all the people from region BB. So the maximum number of people invited is 55.*/
package com.codechef;

import java.util.Scanner;

public class PeacefulParty {

	public static int getResult(int[] a) {
		int max;
		max = a[0] + a[2];
		//System.out.println(max);
		if (a[1] > max) {
			return a[1];
		} else
			return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 3; j++) {
				a[j] = sc.nextInt();

			}
			System.out.println(getResult(a));
		}

	}

}
