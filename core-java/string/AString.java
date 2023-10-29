package assignment.string;

public class AString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STRING
		// 1) Write an application to determine the length of the String
		// str = “Hello World”. (Hint: Use String method)
		System.out.println("Q1--------------------\n\n");

		String str = "Hello World";
		System.out.println(str.length());

		// 2) Write an application to join the two Strings “Hello, ” & “How are you?”
		// (Hint: Use String method)
		System.out.println("\n\nQ2--------------------\n\n");

		String a = "Hello, ", b = "How are you?";
		System.out.println(a.concat(b));

		// 3) Given a String “Java String pool refers to collection of Strings which
		// are stored in heap memory”, perform the following operations
		// (Hint: all operation can be performed using String methods)
		// a. Print the string to console in lowercase
		System.out.println("\n\nQ3a--------------------\n\n");

		String c = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(c.toLowerCase());

		// b. Print the string to console in uppercase
		System.out.println("\n\nQ3b--------------------\n\n");

		System.out.println(c.toUpperCase());

		// c. Replace all ‘a’ character in the string with $ sign
		System.out.println("\n\nQ3c--------------------\n\n");

		System.out.println(c.replace("a", "$"));

		// d. Check if the original String contains the word “collection”
		System.out.println("\n\nQ3d--------------------\n\n");

		System.out.println(c.contains("collection"));

		// e. Check if the following String “java string pool refers to collection of
		// strings which are stored in heap memory” matches the original
		System.out.println("\n\nQ3e--------------------\n\n");

		System.out.println(
				c.contentEquals("java string pool refers to collection of strings which are stored in heap memory"));

		// f. If the string does not match check if there is another method which can
		// be used to check if the strings are equal
		System.out.println("\n\nQ3f--------------------\n\n");

		System.out.println(
				c.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));

		// STRINGBUFFER
		// 1) Write an application to append the following strings “StringBuffer”,
		// “is a peer class of String”, “that provides much of “, “the functionality
		// of strings” using a StringBuffer.
		System.out.println("\n\nQ1--------------------\n\n");

		StringBuffer d = new StringBuffer();
		d.append("StringBuffer ");
		d.append("is a peer class of String ");
		d.append("that provides much of ");
		d.append("the functionality of strings");
		System.out.println(d);

		// 2) Insert the following string “insert text” into the string “It is used
		// to _ at the specified index position” at the location denoted by the sign _
		System.out.println("\n\nQ2--------------------\n\n");

		StringBuffer e = new StringBuffer("It is used to _ at the specified index position");
		System.out.println(e.replace(14, 15, "insert text"));

		// 3) Reverse the following string “This method returns the reversed object
		// on which it was called” using StringBuffer Class
		System.out.println("\n\nQ3--------------------\n\n");

		StringBuffer f = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(f.reverse());

		// STRINGBUILDER
		// 1) Write an application to append the following strings “StringBuffer”,
		// “is a peer class of String”, “that provides much of “, “the functionality
		// of strings” using a StringBuffer.
		System.out.println("\n\nQ1--------------------\n\n");

		StringBuilder g = new StringBuilder();
		g.append("StringBuffer ");
		g.append("is a peer class of String ");
		g.append("that provides much of ");
		g.append("the functionality of strings");
		System.out.println(g);

		// 2) Insert the following string “insert text” into the string “It is used
		// to _ at the specified index position” at the location denoted by the sign _
		System.out.println("\n\nQ2--------------------\n\n");

		StringBuilder h = new StringBuilder("It is used to _ at the specified index position");
		System.out.println(h.replace(14, 15, "insert text"));

		// 3) Reverse the following string “This method returns the reversed object
		// on which it was called” using StringBuilder Class
		System.out.println("\n\nQ3--------------------\n\n");

		StringBuilder i = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(i.reverse());

	}

}
