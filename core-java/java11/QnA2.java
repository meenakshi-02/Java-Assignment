package assignment.java11;

public class QnA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Java 11 supports var keyword for variable declarations. List the scenarios
		// where var keyword cannot be used for such variable declarations. Give reason
		// in support of your answer for each scenario.

		// var cannot be used in an instance and global variable declaration
		// var x = 50;

		// var cannot be used as a Generic type
		// ArrayList<var> a = new ArrayList<>();

		// var cannot be used with the generic type
		// var<Integer> a = new ArrayList<>();

		// var cannot be used without explicit initialization
		// var a;

		// var cannot be used where variable initializer is null
		// var a=null;

		// var cannot be used with Lambda Expression
		// var cannot be used for some parameters and skip for others in lambda exp
		// var cannot be mixed with explicit types in lambda exp
		// var cannot be used without parentheses
		// lambda expression needs an explicit target-type
		// var obj = (a, b) -> (a + b);
		// (var s1, s2) -> s1 + s2;
		// (var s1, String s2) -> s1 + s2;
		// var s1 -> s1.toUpperCase();

		// var cannot be used for method parameters and return type
		// var method1() { return ("Inside Method1"); }
		// void method2(var a) { System.out.println(a); }
	}
}
