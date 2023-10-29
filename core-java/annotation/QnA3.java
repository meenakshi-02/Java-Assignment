package assignment.annotation;

public class QnA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3) Create a custom annotation called @Execute to be applied on methods.
		// Placing the
		// @Execute method on a method implies that method should be invoked using
		// Reflection API
		// (Invoking the method using Reflection API is out of scope of this
		// assignments). The
		// annotation @Execute should have an optional property “sequence” which can be
		// given
		// values such as 1, 2, 3… in the order of priority. In case the sequence
		// property is not used the
		// API may invoke methods in random order.
		// E.g.
		// Class MyClass{
		// @Execute(Sequence=2)
		// Public void myMethod1(){
		// }
		// @Execute(Sequence=1)
		// Public void myMethod2(){
		// }
		// @Execute(Sequence=3)
		// Public void myMethod3(){
		// } }
		// Note: The above annotation tells the system that the invocation should be in
		// the order:
		// myMethod2 first, followed by myMethod1 and finally myMethod3

	}
	
	

}

//class MyClass {
//@Execute(Sequence = 2)
//public void myMethod1() {
//}
//
//@Execute(Sequence = 1)
//public void myMethod2() {
//}
//
//@Execute(Sequence = 3)
//public void myMethod3() {
//}
//}
