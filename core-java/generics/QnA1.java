package assignment.generics;

import java.util.HashSet;


public class QnA1 {

	public static void main(String[] args) {
		// 1) Use a HashSet to hold Employee Objects. Upon running the application,
		// the details of the employees added to the HashSet should be displayed.
		// Employee <<class>>
		// |-- id
		// |-- name
		// |-- salary
		// |-- department
		// |-- displayDetails()
		// Feel free to add properties and methods to Employee Class
		// Note: if we try to store any object other than Employee Object in HashSet, we
		// should not be
		// allowed to.

		HashSet<Employee> a = new HashSet<>();
		Employee e1 = new Employee(1, "Meenakshi", 100, "IT");
		Employee e2 = new Employee(2, "Anni", 200, "Consulting");
		Employee e3 = new Employee(3, "Anki", 300, "Electrical");
		a.add(e1);
		a.add(e2);
		a.add(e3);

		for (Employee e : a)
			e.displayDetails();
	}

}
