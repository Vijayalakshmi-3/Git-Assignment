package Assignment_4.BankAccount;

import java.util.Scanner;

public class _3_BankAccount {
	long id = 1234;
	double balance = 10000, withdraw, deposit;

	public static void main(String[] args) throws Exception {
		_3_BankAccount BA = new _3_BankAccount();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int option;
			System.out.println("Enter Login ID:");
			if (sc.nextInt() == 1234) {
				System.out.println("Welcome 1234");
				System.out.println("Select \n1 for balance check\n2 for withdrawal\n3 for deposits");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Your balance is Rs." + BA.balance);
				} else if (option == 2) {
					System.out.println("Enter amount to withdraw:");
					BA.withdraw = sc.nextDouble();
					if (BA.withdraw > BA.balance || BA.balance == 0) {
						throw new InsufficientBalanceException("Balance Low!");
					} else if (BA.withdraw < 0) {
						throw new IllegalBankTransactionException("Withdraw amount cannot be negative!");
					} else {
						System.out.println("Withdrawn Rs." + BA.withdraw + "/-");
						BA.balance = BA.balance - BA.withdraw;
					}
				} else if (option == 3) {
					System.out.println("Enter Deposit amount in Rs:");
					BA.deposit = sc.nextDouble();
					BA.balance = BA.balance + BA.deposit;
				}
			} else {

				System.err.println("Warning: Enter valid ID!");
				continue;
			}
			while (true) {
				System.out.println("Enter 0 to exit and 1 to enter again");
				option = sc.nextInt();
				if (option == 0) {
					sc.close();
					System.exit(1);
				} else if (option == 1)
					break;
				else
					System.out.println("Invalid!");
			}
		}
	}

}
