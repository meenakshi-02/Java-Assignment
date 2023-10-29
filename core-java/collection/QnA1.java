package assignment.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class QnA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) Given a TreeMap<Long, Contact> which has phone numbers for keys
		// and contact objects for values.
		// Write solutions to
		// a. Fetch all the keys and print them,
		// Note: 
		// a) Contacts should be stored in descending order of phone number
		// b) Contact Class:
		//  • PhoneNumer: <long>
		//  • Name: <String>
		//  • Email: <String>
		//  • Gender: <Enum>
		System.out.println("Q1a--------------------");

		TreeMap<Long, Contact> a = new TreeMap<>(Collections.reverseOrder());

		a.put((long) 1234, new Contact(1234, "Mee", "mee@gmail.com", Gender.FEMALE));
		a.put((long) 2546, new Contact(2546, "Ani", "ani@gmail.com", Gender.FEMALE));
		a.put((long) 3889, new Contact(3889, "Aki", "aki@gmail.com", Gender.MALE));
		a.put((long) 4023, new Contact(4023, "Lee", "lee@gmail.com", Gender.OTHER));

		Set<Long> keyset = a.keySet();

		for (Long i : keyset)
			System.out.println(i);

		// b. Fetch all the values and print them
		System.out.println("\n\nQ1b--------------------");

		Collection<Contact> valset = a.values();

		for (Contact i : valset)
			System.out.println(i);

		// c. Print all key-value pairs
		System.out.println("\n\nQ1c--------------------");

		Set<Entry<Long, Contact>> entset = a.entrySet();

		for (Entry<Long, Contact> i : entset) {
			Long j = i.getKey();
			Contact k = i.getValue();
			System.out.println("Key: {" + j + "} Value: " + k);
		}
	}

}
