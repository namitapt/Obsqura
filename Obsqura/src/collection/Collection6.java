package collection;

import java.util.ArrayList;

public class Collection6 {

	public static void main(String[] args) {
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(123);
		al3.add(234);
		al3.add(345);
		al3.add(456);
		boolean b = al3.contains(234);
		if(b) {
			System.out.println("The list contains 234");
		}
		else {
			System.out.println("The list does not contain 234");
		}
		b=al3.contains(5);
		if(b) {
			System.out.println("The list contains 5");
		}
		else {
			System.out.println("The list does not contain 5");
		}
	}

}
