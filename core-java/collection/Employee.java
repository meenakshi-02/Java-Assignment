package assignment.collection;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Comparator<Employee> {

	private long ID;
	private String Name;
	private String Department;
	private double Salary;
	private char Param;

	public Employee(long i, String n, String d, double s) {
		this.ID = i;
		this.Name = n;
		this.Department = d;
		this.Salary = s;
	}

	public Employee(char Param) {
		this.Param = Param;
	}

	@Override
	public String toString() {
		return "Employee1 [ID=" + ID + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Department, ID, Name, Salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Department, other.Department) && ID == other.ID && Objects.equals(Name, other.Name)
				&& Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary);
	}

	@Override
	public int compareTo(Employee o) {
		return Long.compare(ID, o.ID);
	}

	@Override
	public int compare(Employee a, Employee b) {

		switch (Param) {
		case 'a':
			return Long.compare(a.ID, b.ID);
		case 'b':
			return a.Name.compareTo(b.Name);
		case 'c':
			return a.Department.compareTo(b.Department);
		case 'd':
			return Double.compare(a.Salary, b.Salary);
		default:
			return 0;

		}

	}

}
