package assignment.generics;

import java.util.Date;

public class QnA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4) Design a class named Pair which has two properties. The name of the
		// first property is key and that of the second property is value. When
		// designing
		// the class take case of the following scenarios:
		// a. Create an Object of Pair class to store String value for the property key
		// and String value for the property value. Restriction Apart from String type
		// no other types should be acceptable as Key or value input
		// e.g.
		// myObj.setKey(“1”);
		// myObj.setValue(“Hello”);
		System.out.println("Q4a--------------------");

		Pair<String, String> d = new Pair<>();
		d.setKey("1");
		d.setValue("Hello");
		System.out.println(d.toString());

		// b. Create an object of the class Pair to store String value for the property
		// key and
		// java.util.Date as value for the property value
		// myObj.setKey(“Today is”);
		// myObj.setValue(new java.util.Date());
		// Note: In scenario a. no data apart from String should be used for key and
		// value, in scenario b. no data apart from String for key and java.util.Date
		// should be allowed
		System.out.println("\n\nQ4b--------------------");

		Pair<String, Date> e = new Pair<>();
		e.setKey("Today is");
		e.setValue(new java.util.Date());
		System.out.println(e.toString());

	}
}
