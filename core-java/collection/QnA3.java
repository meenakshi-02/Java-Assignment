package assignment.collection;

import java.util.Scanner;
import java.util.TreeSet;

public class QnA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3) Store at least 10 Employee Objects in an TreeSet<Employee>. When the
		// application runs the user should be asked to select one of the options upon
		// which you will print the employee details in a sorted manner.
		// For E.g.
		// Run Application:
		//     a) ID
		//     b) Name
		//     c) Department
		//     d) Salary
		// Your choice: b
		// <Should print all the employee’s details sorted by name>

		TreeSet<Employee> d = new TreeSet<>();

		d.add(new Employee(1234, "Flem", "IT", 100));
		d.add(new Employee(2456, "Tom", "Electrical", 600));
		d.add(new Employee(3046, "Mee", "Mechanical", 300));
		d.add(new Employee(4230, "Grey", "IT", 400));
		d.add(new Employee(5493, "Elli", "Biotech", 3000));
		d.add(new Employee(6104, "Bruce", "Agri", 600));
		d.add(new Employee(7340, "Duke", "Security", 4000));
		d.add(new Employee(8093, "Lee", "Consulting", 800));
		d.add(new Employee(9234, "Bonn", "IT", 200));
		d.add(new Employee(1086, "Bill", "Intelligence", 500));

		System.out.print("Enter one of the options to sort by\na: ID\nb: Name\nc: Department\nd: Salary\nOption: ");
		Scanner sc = new Scanner(System.in);
		char e = sc.next().charAt(0);
		sc.close();

		d.stream().sorted(new Employee(e)).forEach(System.out::println);

	}

}
