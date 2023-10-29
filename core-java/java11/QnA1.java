package assignment.java11;

public class QnA1 {

	public static void main(String[] args) {

		// 1. Write a program to calculate the Simple Interest with minimal code using
		// features of Java 11.
		// Hint: Use the concept of functional interface and Local variable syntax for
		// lambda
		// parameters.

		Consumer a = (var p, var r, var t) -> {
			System.out.println("Simple Interest = " + (p * r * t) / 100);
		};
		a.consumer(2, 3, 4);
	}

}
