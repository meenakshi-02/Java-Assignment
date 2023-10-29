package assignment.ExcpHand;

import java.util.Scanner;

public class QnA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXCEPTION HANDLING
		// 1) Write an application that accepts two numbers, divides the first number
		// with the second number and display the result. Hint: You need to handle
		// ArithmeticException which is thrown when there is an attempt to divide
		// a number by zero.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		try {

			int c = a / b;
			System.out.println("a divided by b equals " + c);

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
