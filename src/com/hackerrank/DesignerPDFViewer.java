package com.hackerrank;

import java.util.*;

public class DesignerPDFViewer {

	public static int designerPdfViewer(int[] h, String word) {
		// Write your code here	
		int width = word.length();
		int height = 0;
		for (int i = 0; i < word.length(); i++) {
			int temp = word.charAt(i) - 97;			
			if(height<h[temp]) {
				
				height=h[temp];
			}						
		}
		int area = height*width;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h[] = new int[26];
		for (int i = 0; i < 26; i++) {
			h[i] = sc.nextInt();
		}

		String word = sc.next();

		System.out.println(designerPdfViewer(h, word));

	}

}
