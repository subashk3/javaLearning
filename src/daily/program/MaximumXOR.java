/*	
3. Maximum XOR of Two Numbers in an Array.
    Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.
    Example :
	Input: nums = [3,10,5,25,2,8]
6
3 10 5 25 2 8
	Output: 28
	Explanation: The maximum result is 5 XOR 25 = 28.
	*/
package daily.program;
import java.util.Scanner;
public class MaximumXOR {
	private int maxiXOR(int[] a) {
		int max = 0;
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (i <= j) {
					res = a[i] ^ a[j];
				}
				if (res > max) {
					max = res;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MaximumXOR o = new MaximumXOR();
		System.out.println();
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(o.maxiXOR(a));
		in.close();
	}

}
