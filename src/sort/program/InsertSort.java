package sort.program;

public class InsertSort {

	public void insertSort() {
		int a[] = { 52, 7, 5, 4, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			int currentValue = a[i];
			int j = i - 1;
			while ((j >= 0) && a[j] > currentValue) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = currentValue;
		}
		for (int value : a) {
			System.out.print(value + " ");
		}
	}
	public static void main(String[] args) {
		InsertSort obj = new InsertSort();
		obj.insertSort();

	}

}
