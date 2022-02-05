package testprograms;

import java.util.*;

class MyArry {
	private int intialcapacity = 4;
	private int arr[];
	private int size, capacity;

	MyArry() {
		size = 0;
		arr = new int[intialcapacity];
		capacity = intialcapacity;
	}

	private void expand() {
		capacity = capacity * 2; // 8
		arr = Arrays.copyOf(arr, capacity);   // {1,2,3,4,5},8
		
		// arr [8] = {1,2,3,4,0,0,0,0}
		
		
	}

	public void add(int a) {
		if (size == capacity) { // 0==4 1==4 45678==8
			expand();
		}
		arr[size++] = a; // arr[0] = 5; size = 1 arr[1] = 10; arr[4] = 5;
		// arr [8] = {1,2,3,4,5,0,0,0}
	}

	public void display() {
		System.out.println("Size of array now : " + arr.length);
		for(int i:arr) {
			System.out.print(i+"  ");
	}

		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

	}
}

public class ArrayCapacity1 {
	public static void main(String[] args) {
		MyArry arr = new MyArry();
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