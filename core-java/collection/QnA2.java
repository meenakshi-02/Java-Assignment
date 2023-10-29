package assignment.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class QnA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2) Write an application to store 10 unique product objects. In case
		// there is an attempt to add a duplicate product, it should be silently
		// rejected. Hint: Use HasSet or TreeSet
		System.out.println("Q2--------------------");

		HashSet<Contact> b = new HashSet<>();

		b.add(new Contact(1234, "Mee", "mee@gmail.com", Gender.FEMALE));
		b.add(new Contact(2546, "Ani", "ani@gmail.com", Gender.FEMALE));
		b.add(new Contact(3889, "Aki", "aki@gmail.com", Gender.OTHER));
		b.add(new Contact(4023, "Ken", "Ken@gmail.com", Gender.FEMALE));
		b.add(new Contact(8630, "Akii", "akii@gmail.com", Gender.OTHER));
		b.add(new Contact(1234, "Mee", "mee@gmail.com", Gender.FEMALE));
		b.add(new Contact(2546, "Ani", "ani@gmail.com", Gender.FEMALE));
		b.add(new Contact(3889, "Aki", "aki@gmail.com", Gender.OTHER));
		b.add(new Contact(4023, "Ken", "Ken@gmail.com", Gender.FEMALE));
		b.add(new Contact(8630, "Akii", "akii@gmail.com", Gender.OTHER));

		for (Contact i : b)
			System.out.println(i);

		// Extra(optional): Use ArrayList in the above solution. (This is optional)
		System.out.println("\n\nQ2a--------------------");

		ArrayList<Contact> c = new ArrayList<>();

		c.add(new Contact(1234, "Mee", "mee@gmail.com", Gender.FEMALE));
		c.add(new Contact(2546, "Ani", "ani@gmail.com", Gender.FEMALE));
		c.add(new Contact(3889, "Aki", "aki@gmail.com", Gender.OTHER));
		c.add(new Contact(4023, "Ken", "Ken@gmail.com", Gender.FEMALE));
		c.add(new Contact(8630, "Akii", "akii@gmail.com", Gender.OTHER));
		c.add(new Contact(1234, "Mee", "mee@gmail.com", Gender.FEMALE));
		c.add(new Contact(2546, "Ani", "ani@gmail.com", Gender.FEMALE));
		c.add(new Contact(3889, "Aki", "aki@gmail.com", Gender.OTHER));
		c.add(new Contact(4023, "Ken", "Ken@gmail.com", Gender.FEMALE));
		c.add(new Contact(8630, "Akii", "akii@gmail.com", Gender.OTHER));

		for (Contact i : c)
			System.out.println(i);
	}
}
