package assignment.generics;

public class Employee {

	private long id;
	private String name;
	private double salary;
	private String department;

	public Employee(long id, String nm, double sl, String dt) {
		this.id = id;
		this.name = nm;
		this.salary = sl;
		this.department = dt;
	}

	public void displayDetails() {
		System.out.println("id: " + this.id + "\nname: " + this.name + "\nsalary: " + this.salary + "\ndepartment: "
				+ this.department);
	}

}
