package com.geeksforgeeks;

public class LongestCommon {
	public String longestCommonPrefix(String[] strs) {
		String res = "";
		String temp = strs[0];
		boolean isPresent = true;
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 0; j < strs.length; j++) {
				if (temp.charAt(i) == strs[j].charAt(i)) {
					isPresent = false;
				} else {
					return res;
				}
			}
			if (!isPresent) {
				res += temp.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		LongestCommon common = new LongestCommon();
		// String[] array = { "geeksforgeeks", "geaeze", "geeksfor", "gee" };
		String[] array = { "ab", "a" };

		System.out.println(common.longestCommonPrefix(array));
	}
}
