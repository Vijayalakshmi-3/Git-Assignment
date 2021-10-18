package Assignment_1;

import java.util.Scanner;

public class _4_MarkResults {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 subject marks:");
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		if (subject1 >= 60 && subject2 >= 60 && subject3 >= 60)
			System.out.println("You have passed.");
		else if ((subject1 >= 60 && subject2 >= 60) || (subject2 >= 60 && subject3 >= 60)
				|| (subject3 >= 60 && subject1 >= 60))
			System.out.println("You have been promoted.");
		else
			System.out.println("You have failed.");
		sc.close();
	}

}
