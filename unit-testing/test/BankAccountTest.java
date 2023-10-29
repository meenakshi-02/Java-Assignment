package assignment.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import jupiter.MathUtils;

class BankAccountTest {

	@Test
	void greaterThanBalance() {
		assertThrows(InsufficientBalanceException.class, () -> BankAccount.withdraw(3000));
	}

	@Test
	void equalToBalance() {
		assertDoesNotThrow(() -> BankAccount.withdraw(2000));
	}

	@Test
	void smallerThanBalance() {
		assertDoesNotThrow(() -> BankAccount.withdraw(1000));
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("This statement will be executed once at first");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("This statement will be executed before each test");
	}

	@AfterEach
	void afterEach() {
		System.out.println("This statement will be executed after each test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("This statement will be executed once at last");
	}

}
