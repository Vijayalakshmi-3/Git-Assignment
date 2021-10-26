package BasicDataStructureAssignment;

import java.util.Scanner;

public class _9_MarkTotalAndAverageOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subject1[] = new int[3], subject2[] = new int[3], subject3[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter mark for subject A, B, C for student " + (i+1));
			subject1[i] = sc.nextInt();
			subject2[i] = sc.nextInt();
			subject3[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Total of student " + (i + 1) + ": " + (subject1[i] + subject2[i] + subject3[i])
					+ "\nAverage of student " + (i + 1) + ": " + ((subject1[i] + subject2[i] + subject3[i]) / 3));
		}
		sc.close();
	}
}
