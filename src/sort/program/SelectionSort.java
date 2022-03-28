package sort.program;

public class SelectionSort {
	public void selectionSorting() {
		int arr[] = { 78, 54, 21, 65, 77, 54 };
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
			
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}

		}
		for (int k : arr)
			System.out.print(k + " ");

	}

	public static void main(String[] args) {
		SelectionSort objSelectionSort = new SelectionSort();

		objSelectionSort.selectionSorting();
	}

}
