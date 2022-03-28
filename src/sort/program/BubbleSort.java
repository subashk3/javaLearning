package sort.program;

public class BubbleSort {
	void print() {
		int a[] = { 17, 3, 1, 6, 2, 8 };

		for (int i = 1; i < a.length; i++) {
			boolean isRun = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isRun = true;
				}
			}
			if (!isRun) {
				break;
			}
		}
		for (int x : a) {
			System.out.print(x + " ");
		}

	}

	public static void main(String[] args) {
		BubbleSort objBubbleSort = new BubbleSort();

		objBubbleSort.print();

	}

}
