package assignment.java11;

import java.util.ArrayList;
import java.util.Arrays;

public class QnA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. “A quick brown fox jumps over the lazy dog”. Create an ArrayList from the
		// given String. Such an ArrayList should include each word from the given
		// sentence.
		// Finally convert such List to an array using Java 11 methods and print the
		// output.

		String b = "A quick brown fox jumps over the lazy dog";
		ArrayList<String> c = new ArrayList<>(Arrays.asList(b.split(" ")));
		// String[] d = c.toArray(String[]::new);
		String[] d = c.toArray(new String[c.size()]);

		for (String i : d)
			System.out.println(i);

	}

}
