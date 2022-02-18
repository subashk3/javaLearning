package testprograms;

public class SelectionSort {

	public void sorting(int[] a, int n) {
		int maxI;

		// first loop
		for (int i = 0; i < n - 1; i++) {
			maxI = i;
			for (int j = i + 1; j < n; j++) {
				if (a[maxI] < a[j]) {

					maxI = j;
				}
				// swap the index
				a[maxI] = a[maxI] + a[j];
				a[j] = a[maxI] - a[j];
				a[maxI] = a[maxI] - a[j];
			}
		}

		for (int arr : a)
			System.out.print(arr + " ");
	}

	public static void main(String[] args) {

		// Selection sort for the array

		int a[] = { 40, 7, 5, 1 };
		int n = a.length;
		SelectionSort o = new SelectionSort();
		o.sorting(a, n);

	}

}
