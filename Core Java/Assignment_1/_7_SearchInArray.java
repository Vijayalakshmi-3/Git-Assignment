package Assignment_1;

import java.util.Scanner;

public class _7_SearchInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[15];
		System.out.println("Enter 15 numbers:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the number to search:");
		int key = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("The number " + key + " is available at " + (i + 1) + "th index");
				System.exit(1);
			}
		}
		System.out.println("The number " + key + " is not available");
		sc.close();
	}

}
