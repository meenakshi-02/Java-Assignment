package assignment.annotation;

@Info(AuthorID = 1234, Date = "13-10-23", Time = "11:30", Version = 5.6)
public class QnA2 {

	@Info(Author = "Lily", AuthorID = 1234, Date = "13-10-23", Time = "11:30", Version = 1.2)
	static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2) Build a custom annotation called @Info, which can be used by developers on
		// a class, a property, or a method. The developer can provide the following
		// information
		// when using this annotation:
		// a) AuthorID: <<Developers ID>> - (Mandatory Input)
		// b) Author: <<Developers name>> - (Optional Input)
		// c) Supervisor: <<Developers Supervisor>> - (Optional Input)
		// d) Date: <<”String Date”>> - (Mandatory Input)
		// e) Time: <<”String Time”>> - (Mandatory Input)
		// f) Version: <<Numerical Version >> - (Mandatory Input)
		// g) Description: <<Description of the class, method, or property >> -
		// (Optional Input)

	}

	@Info(Supervisor = "Bonn", AuthorID = 1234, Date = "13-10-23", Time = "11:30", Version = 9)
	void display() {
		System.out.println("Hello there");
	}
}
