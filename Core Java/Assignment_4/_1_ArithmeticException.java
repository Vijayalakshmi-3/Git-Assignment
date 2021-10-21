package Assignment_4;

import java.util.Scanner;

public class _1_ArithmeticException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Do not enter 0");
		}
		sc.close();
	}

}
