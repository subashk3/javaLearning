package testprograms;

import java.util.*;

class Array {
	private int intialcapacity = 1;
	private int arr[];
	private int size, capacity;

	Array() {
		size = 0;
		arr = new int[intialcapacity];
		capacity = intialcapacity;
	}

//	private void expand() {
//		int i =arr.length;
//		capacity +=i;
//		arr = Arrays.copyOf(arr, capacity); 
//	}

	public void add(int a) {
		if (size == capacity) {
			int i = arr.length;
			capacity += i;
			arr = Arrays.copyOf(arr, capacity);
		}
		arr[size++] = a;
	}

	public void display() {
		System.out.println("Size of array now : " + arr.length);
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}

public class ArrayCapacity {
	public static void main(String[] args) {
		Array arr = new Array();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("********************************");
			System.out.println("Press 1 to add element in array");
			System.out.println("Press 2 to Display all element in array");
			System.out.println("Press 3 to exit ");
			System.out.println("********************************");
			int n = input.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter the value to insert in array : ");
				int a = input.nextInt();
				arr.add(a);
				break;
			case 2:
				System.out.println("Display all elements in array");
				arr.display();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
		}

	}
}