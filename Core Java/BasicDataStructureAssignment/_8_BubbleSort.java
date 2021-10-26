package BasicDataStructureAssignment;

import java.util.Scanner;

public class _8_BubbleSort {
	static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[15];
		System.out.println("Enter 15 numbers:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		bubbleSort(arr);
		System.out.println("After bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(" ");
		}

		sc.close();
	}

}
