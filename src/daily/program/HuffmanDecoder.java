/*
1. HuffmanDecoder
Here we will not make huffman code, but we'll be decoding one
The dictionary is already known and it consist of only five coded letters.
A → 0
B → 10
C → 110
D → 1110
E → 1111
You are given the encoded string, return the original one.
 Eg.
Input 1101110 Output:CD
Input 11111100 Output: ECA
*/
package daily.program;
import java.util.HashMap;
import java.util.Scanner;

public class HuffmanDecoder {
	HashMap<String, Character> map = new HashMap<String, Character>();
	public String getHuffman(String number) {
		String result = "";
		int oneCount = 0;
		map.put("0", 'A');
		map.put("10", 'B');
		map.put("110", 'C');
		map.put("1110", 'D');
		map.put("1111", 'E');
		int j = 0;
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '0') {
				result += map.get(number.substring(j, i + 1));
				j = i + 1;
				oneCount = 0;
			} else if (oneCount == 3) {
				result += 'E';
				j = i + 1;
				oneCount = 0;
			} else {
				oneCount++;
			}
		}
		// System.out.println(oneCount);
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HuffmanDecoder o = new HuffmanDecoder();
		System.out.println();
		String str = in.nextLine();
		in.close();
		System.out.println(o.getHuffman(str));
	}
}
