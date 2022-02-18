package everyday;

public class SortClass {
	// Bubble Sorting
	public void bubbleSorting(int[] a, int n) {

		// first loop
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < n - i; j++) {// compare each element

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int k : a)
			System.out.print(k + " ");

	}

	public static void main(String[] args) {
		int a[] = { 40, 7, 5, 1 };
		int n = a.length;

		SortClass o = new SortClass();
		//o.bubbleSorting(a, n);
	}

}
