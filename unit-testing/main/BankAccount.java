package assignment.junit;

//3) Write a BankAccount class with method withdraw which accepts amount to be withdrawn 
//from the account (amount to be deducted from the balance of the account). In case there 
//are insufficient funds a InsufficientFundsExpcetion should be raised. After defining the 
//method perform Junit testing to check whether the InsufficientFundsException is raised 
//when you try to withdraw amount that is over and above the account balance. 
//bankAccount.withdraw(20,000); should raise the InsufficientFundsException if the 
//balance in the account is less than 20,000. 

//4) Write a Junit Testing to show the use of Lifecycle hooks annotation such as @BeforeAll, 
//@BeforeEach @AfterEach and @AfterAll

public class BankAccount {

	private static double balance = 2000;

	public static void withdraw(double amount) throws InsufficientBalanceException {

		if (amount > balance)
			throw new InsufficientBalanceException("Insufficient balance");
	}
}
