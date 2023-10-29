package assignment.annotation;

public class QnA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) Create a custom annotation called @Test which can be only applied
		// on a method implying that the following method is a test-case. (Is it
		// possible to restrict the annotation to be applied only on a non-static
		// method?)---NO

	}

	@Test
	void display() {
		System.out.println("Hello there");
	}

}
