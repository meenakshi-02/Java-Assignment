package assignment.ExcpHand;

public class SavingAccount {

	@SuppressWarnings("unused")
	private long id;
	private double balance;

	public SavingAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
		
		if (amount > this.balance)
			throw new InsufficientBalanceException("Insufficient balance");
		else if (amount < 0)
			throw new IllegalBankTransactionException("Illegal transaction");
		else {
			this.balance = this.balance - amount;
			System.out.println("Amount debited successfully.\nAccount balance is " + this.balance);
			return this.balance;
		}
	}

	public double deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Amount credited successfully.\nAccount balance is " + this.balance);
		return this.balance;
	}
}
