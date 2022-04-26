package workout;

public class Recursion {

	int[] merge(int a[], int b[]) {
		return b;

	}

	int[] sort(int a[], int start, int end) {

		if (start == end) {
			return a;
		}

		int mid = (start + end) / 2;
		return a;

		// int left[] = sort(a,)

	}

	public static void main(String[] args) {

		Recursion obj = new Recursion();

		int a[] = { 12, 11, 13, 5, 6, 7 };

		obj.sort(a, 0, a.length - 1);

	}
}
