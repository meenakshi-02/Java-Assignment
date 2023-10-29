package assignment.collection;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class QnA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4) Given a LinkedList of Objects representing date of birth’s (use any
		// inbuild java class to represent date), print the date’s along with the
		// message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap
		// year.
		// E.g. a) For the date 23-12-2000
		// Your date of birth is 23-12-2000 and it was a leap year
		// c) For the date 23-12-2001
		// Your date of birth is 23-12-2000 and it was not a leap year
		// Note: You need to access the Dates in the reverse order. I.e. start from the
		// last object and move towards the first object

		LinkedList<LocalDate> f = new LinkedList<>();

		f.add(LocalDate.of(2002, 3, 5));
		f.add(LocalDate.of(2020, 3, 5));
		f.add(LocalDate.of(1987, 3, 5));
		f.add(LocalDate.of(1999, 3, 5));
		f.add(LocalDate.of(2000, 3, 5));

		Iterator<LocalDate> it = f.descendingIterator();

		while (it.hasNext()) {

			String g = "not a leap year";
			LocalDate h = it.next();
			int year = h.getYear();

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				g = "a leap year";

			System.out.println("Your date of birth is " + h + " and it was " + g);
		}

	}
}
