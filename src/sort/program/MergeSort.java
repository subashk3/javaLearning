package sort.program;

public class MergeSort {

	void merge(int a[], int start, int mid, int end) {
		int p = start;
		int q = mid + 1;
		int k = 0;
		int temp[] = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			// remaining value store in array
			if (p > mid)
				temp[k++] = a[q++];
			else if (q > end)
				temp[k++] = a[p++];
			// Sorting Individual element
			else if (a[p] > a[q]) {
				temp[k++] = a[q++];
			} else
				temp[k++] = a[p++];
		}
		// update main array
		for (int j = 0; j < k; j++) {
			a[start++] = temp[j];
		}
	}

	// split array
	void sort(int a[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			sort(a, start, mid);
			sort(a, mid + 1, end);
			merge(a, start, mid, end);
		}

	}

	public static void main(String[] args) {
		int ar[] = { 78, 45, 104, 14, 6 };
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(ar, 0, ar.length - 1);
		for (int value : ar)
			System.out.print(value + " ");
	}

}
