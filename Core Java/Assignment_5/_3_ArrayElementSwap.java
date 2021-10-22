package Assignment_5;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_ArrayElementSwap {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the number of elements more than 5:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Before Swap:");
		System.out.println(arr);
		//swapping 2nd and 5th element in arr
		Integer integer=arr.get(1);
		arr.set(1, arr.get(4));
		arr.set(4,integer);
		System.out.println("After Swap:");
		System.out.println(arr);
		//generic method of array swapping
		int array[]=new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<5;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Before swapping first and 5th element:");
		for(int i:array)System.out.print(i+" ");
		//swapping first and last element
		int temp=array[0];
		array[0]=array[4];
		array[4]=temp;
		System.out.println();
		System.out.println("After swapping first and 5th element:");
		for(int i:array)System.out.print(i+" ");
		sc.close();
	}

}
