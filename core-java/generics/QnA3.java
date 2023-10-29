package assignment.generics;

import java.util.ArrayList;

public class QnA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3) Write a generic method to exchange the positions of two different
		// elements in an array.

		ArrayList<Integer> c = new ArrayList<>();
		c.add(40);
		c.add(67);
		c.add(34);
		c.add(50);

		exchangePos(c, 1, 2);
		for (Integer i : c)
			System.out.println(i);

	}
	
	public static <T> void exchangePos(ArrayList<T> arr, int a, int b) {
		T temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}

}
