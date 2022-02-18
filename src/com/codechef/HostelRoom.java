/*There are initially XX people in a room.

You are given an array AA of length NN which describes the following events:

If Ai≥0Ai≥0, then AiAi people enter the room at ii-th minute. For e.g. if A2=3A2=3, then 33 people enter the room at the 22-nd minute.
If Ai<0Ai<0, then |Ai||Ai| people leave the room at ii-th minute. Here |Ai||Ai| denotes the absolute value of AiAi. For e.g. if A4=−2A4=−2, then 22 people leave the room at the 44-th minute.
Determine the maximum number of people in the room at any moment of time.

It is guaranteed in the input that at any moment of time, the number of people in the room does not become negative.

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first line of each test case consists of two integers NN and XX - the length of the array AA and the number of people in the room initially.
The second line of each test case contains NN integers A1,A2,A3,…ANA1,A2,A3,…AN.
Output Format
For each testcase, output the maximum number of people in the room at any point of time.

Constraints
1≤T≤1001≤T≤100
1≤N≤1001≤N≤100
0≤X≤1000≤X≤100
−100≤Ai≤100−100≤Ai≤100
Sample Input 1 
3
5 8
0 3 3 -13 5
4 5
0 -2 2 3
3 5
-2 5 -2
Sample Output 1 
14
8
8
Explanation
Test case-1: In the 33-rd minute, the room contains 8+0+3+3=148+0+3+3=14 people which is the maximum number of people in the room at any point of time.

Test case-2: In the 44-th minute, the room contains 5+0−2+2+3=85+0−2+2+3=8 people which is the maximum number of people in the room at any point of time.

Test case-3: In the 22-nd minute, the room contains 5−2+5=85−2+5=8 people which is the maximum number of people in the room at any point of time.*/
package com.codechef;

import java.util.Scanner;

public class HostelRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int[] a = new int[N];
			for (int j = 0; j < N; j++) {
				a[j] = sc.nextInt();
			}
			int max = X;
			for(int k=0;k<N;k++) {
				X+=a[k];
				if(X>max) {
					
					max =X;
				}
							
			}
			System.out.println(max);

		}

	}

}
