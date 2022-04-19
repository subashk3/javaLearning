/*Given a number system with only 3 and 4. Find the nth number in the number system. First few numbers in the number system are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444, …*/
package workout;
public class GFG {
	static void find(int n) {
		String[] arr = new String[n + 1];
		arr[0] = "";
		int size = 1, m = 1;
		while (size <= n) {
			for (int i = 0; i < m && (size + i) <= n; i++)
				arr[size + i] = "3" + arr[size - m + i];
			for (int i = 0; i < m && (size + m + i) <= n; i++)
				arr[size + m + i] = "4" + arr[size - m + i];
			m = m << 1;
			// Or m = m*2;
			size = size + m;
		}
		System.out.println(arr[n]);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 16; i++)
			find(i);
	}
}
