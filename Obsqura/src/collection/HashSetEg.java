package collection;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Water");
		hs.add("Coffee");
		hs.add("Tea");
		hs.add("Juice");
		hs.add("Coffee");
		System.out.println("HashSet 1: "+hs);
		System.out.println();
		
		hs.remove("Juice");
		System.out.println("After removing Juice: "+hs);
		System.out.println();
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Mango Juice");
		hs2.add("Apple Juice");
		System.out.println("HashSet 2: "+hs2);
		System.out.println();
		
		hs.addAll(hs2);
		System.out.println("Adding both HashSets: "+hs);
		System.out.println();
		
		hs.removeAll(hs2);
		System.out.println("Removing HashSet2 from HashSet1: "+hs);
		
	}

}
