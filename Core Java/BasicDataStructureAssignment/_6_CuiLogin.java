package BasicDataStructureAssignment;

import java.util.Scanner;

public class _6_CuiLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = " ", password = " ";
		int count = 1;
		while (true) {
			System.out.println("Enter Username and Password:");
			userName = sc.next();
			password = sc.next();
			if (userName.equals("Roja") && password.equals("Password")) {
				System.out.println("Welcome Roja");
				sc.close();
				System.exit(1);
			} else {
				System.out.println("Attempt :" + count + " Wrong Username/Password");
				count++;
			}
			if(count==4) {
				System.out.println("Contact Admin");
				sc.close();
				System.exit(1);
			}
		}
	}

}
