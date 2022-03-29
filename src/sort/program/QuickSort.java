package sort.program;

public class QuickSort {

	public int position(int arr[], int start, int end) {
		int i = start + 1;
		int pivot = arr[start];
		for (int j = start + 1; j <= end; j++) {
			if (arr[j] < pivot) {
//				swap(arr[i], arr[j]);
				int swapValue = arr[i];
				arr[i] = arr[j];
				arr[j] = swapValue;
				i += 1;
			}
		}
		// swap the arrays
		int temp = arr[i - 1];
		arr[i - 1] = arr[start];
		arr[start] = temp;

		return i - 1;
	}

	public void quickSort(int a[], int start, int end) {

		if (start < end) {

			// get previous pivot position
			int pivotPosition = position(a, start, end);
			quickSort(a, start, pivotPosition - 1);
			quickSort(a, pivotPosition + 1, end);
		}

	}

	public static void main(String[] args) {
		int ar[] = { 5,5, 87, 68, 3, 2, 1 };
		QuickSort quick = new QuickSort();
		quick.quickSort(ar, 0, ar.length - 1);
		for (int value : ar)
			System.out.print(value + " ");
	}

}
