/*2.  Words Diff? You are given two words. Find out the difference by outputting the characters that are not present in the one but not in the other word. Example: “Something”, “else” output: ”omthing” */
package daily.program;

import java.util.*;

public class WordsDiff {
	private String checkDifferent(String string1, String string2) {
		for (int i = 0; i < string2.length(); i++) {
			for (int j = 0; j < string1.length(); j++) {
				if (string2.charAt(i) == string1.charAt(j)) {
					string1 = string1.replace(Character.toString(string1.charAt(j)), "");
				}
			}
		}
		return string1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		WordsDiff o = new WordsDiff();
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		System.out.println(o.checkDifferent(s1, s2));

	}

}
