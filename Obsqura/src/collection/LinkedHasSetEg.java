package collection;

import java.util.LinkedHashSet;

public class LinkedHasSetEg {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Water");
		lhs.add("Coffee");
		lhs.add("Tea");
		lhs.add("Juice");
		lhs.add("Coffee");
		System.out.println("LinkedHashSet 1: "+lhs);
		System.out.println();
		
		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
		lhs2.add("Mango Juice");
		lhs2.add("Apple Juice");
		System.out.println("LinkedHashSet 2: "+lhs2);
		System.out.println();
		
		lhs.addAll(lhs2);
		System.out.println("Adding both HashSets: "+lhs);
	}

}
