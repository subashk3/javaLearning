/*A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with 

a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Example



The person can buy a , or a . Choose the latter as the more expensive option and return .

Function Description

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget
Returns

int: the maximum that can be spent, or  if it is not possible to buy both items
Input Format

The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models.
The second line contains  space-separated integers , the prices of each keyboard model.
The third line contains  space-separated integers , the prices of the USB drives.

Constraints

The price of each item is in the inclusive range .
Sample Input 0

10 2 3
3 1
5 2 8
Sample Output 0

9
Explanation 0

Buy the  keyboard and the  USB drive for a total cost of .

Sample Input 1

5 1 1
4
5

Sample Output 1

-1
Explanation 1

There is no way to buy one keyboard and one USB drive because , so return .*/
package com.hackerrank;

import java.util.*;

public class ElectronicsShop {
	static int getMoney(int[] keyboards, int[] drives, int b) {
		int maximum = 0;// return maximum amount;
		int sum = 0;//sum of the two product in price
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				sum = keyboards[i] + drives[j];
				if (sum >= maximum && sum <= b) {
					maximum = sum;
				}
			}
		}
		if (maximum == 0)
			return -1;
		return maximum;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt(); // Price
		int n = sc.nextInt(); // Keyboards size
		int m = sc.nextInt(); // Drives size
		int[] keyboards = new int[n];
		int[] drives = new int[m];
		for (int i = 0; i < n; i++) {
			keyboards[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			drives[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(getMoney(keyboards,drives,b));

	}

}
