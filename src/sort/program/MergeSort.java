package sort.program;

public class MergeSort {

	void merge(int a[], int start, int mid, int end) {

	}

	// split array
	void sort(int a[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			sort(a, start, mid);
			sort(a, mid + 1, end);
			
		}

	}

	public static void main(String[] args) {

		int ar[] = { 78, 45, 54, 14, 6 };

	}

}
