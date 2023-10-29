package assignment.ExcpHand;

import java.util.Scanner;

public class QnA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2) Carrying forward with the above problem, handle ArithmeticException
		// by raising UnsupportedOperationException as a solution.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		try {

			int c = a / b;
			System.out.println("a divided by b equals " + c);

		} catch (ArithmeticException e) {
			try {

				throw new UnsupportedOperationException("Invalid operation for division");

			} catch (UnsupportedOperationException e1) {
				System.out.println("Error: " + e1.getMessage());
			}
		}

	}
}
