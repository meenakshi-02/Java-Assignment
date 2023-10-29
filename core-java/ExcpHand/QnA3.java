package assignment.ExcpHand;

import java.util.Scanner;

public class QnA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3) Write an application to perform withdraw functionality on a SavingAccount
		// object. Point to note:
		// a. Raise InsufficientBalanceException if you are trying to withdraw
		// more than balance or when you balance is zero. E.g. if you balance
		// is 2000 and if you are trying to withdraw 2100 or if you balance is 0
		// and you are trying to withdraw positive value.
		// b. Raise IllegalBankTransactionException if you are trying to withdraw
		// a negative value from your balance. E.g. if you try to withdraw a
		// negative value savingAcc.withdraw(-1000);
		// Note: SavingAccount
		// |-- long id
		// |-- double balance
		// |--double withdraw(double amount)
		// |--double deposit(double amount)

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your id: ");
		long id = sc.nextLong();
		System.out.print("Enter your balance: ");
		double bal = sc.nextDouble();

		SavingAccount ac = new SavingAccount(id, bal);
		int st;

		do {
			System.out.print("Enter 0 for exit, 1 for withdrawl, 2 for deposit: ");
			st = sc.nextInt();

			try {

				switch (st) {
				case 0:
					System.out.println("Exited");
					break;
				case 1:
					System.out.print("Enter amount to be withdrawn: ");
					ac.withdraw(sc.nextDouble());
					break;
				case 2:
					System.out.print("Enter amount to be deposited: ");
					ac.deposit(sc.nextDouble());
					break;

				}
			} catch (InsufficientBalanceException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (IllegalBankTransactionException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (st != 0);
		sc.close();

	}

}
