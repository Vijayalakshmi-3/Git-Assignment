package ExceptionHandlingAssignment;

import java.util.Scanner;
import java.lang.UnsupportedOperationException;

public class _2_UnsupportedOperationException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try  {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			sc.close();
		throw new UnsupportedOperationException("Do not enter 0 in division");
		}
		sc.close();
	}

}
