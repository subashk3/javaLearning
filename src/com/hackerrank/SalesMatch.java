/*There is a large pile of socks that must be paired by color. 

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where 
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9

10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output

3
Link: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
*/
package com.hackerrank;

import java.lang.reflect.Array;
import java.util.*;

public class SalesMatch {
	public static int sockMerchant(int n, int[] ar) {
		int count = 0;
		int ct = 0;
		HashSet st = new HashSet();
		for (int i = 0; i < ar.length; i++) {
			int temp = ar[i];
			if (!st.contains(temp)) {
				st.add(temp);
			} else {
				count++;
				st.remove(temp);
			}
			

		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println(sockMerchant(n, ar));

	}
}
