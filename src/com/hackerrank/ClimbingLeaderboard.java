package com.hackerrank;

import java.util.Scanner;

public class ClimbingLeaderboard {
	public static int[] climbingLeaderboard(int[] ranked, int[] player) {

		int[] arr = new int[player.length];

		for (int i = 0; i < player.length; i++) {
			//System.out.println("-");
			for (int j = 0; j < ranked.length - 1; j++) {

				int temp = player[i];

				if (ranked[j] >= temp && temp < ranked[j + 1] && temp != ranked[j + 1]) {
					arr[i] = j + 1;
					//System.out.println(j);
					// System.out.println(ranked[i]);
				}

			}

		}

		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			rank[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] players = new int[m];
		for (int i = 0; i < m; i++) {
			players[i] = sc.nextInt();
		}

		int[] res = climbingLeaderboard(rank, players);

		
		  for (int i : res) System.out.println(i);
		 

	}

}
