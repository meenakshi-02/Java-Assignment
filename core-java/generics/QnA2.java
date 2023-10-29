package assignment.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class QnA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2) Write an application to hold 10 random int values as keys and 10
		// random double values as values for a HashMap. Print the data store
		// in the HashMap. Note: Keys can only be int and values double

		HashMap<Integer, Double> b = new HashMap<>();
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			int j = rand.nextInt();
			double k = rand.nextDouble();
			b.put(j, k);
		}

		for (Map.Entry<Integer, Double> i : b.entrySet()) {
			System.out.println(i.toString());
		}
	}
}
