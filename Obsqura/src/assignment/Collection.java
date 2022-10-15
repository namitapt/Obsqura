package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Red");
		aList.add("Green");
		aList.add("Blue");
		aList.add("Red");
		aList.add("Orange");
		Iterator i = aList.iterator();
		System.out.println(aList);
		System.out.println();
		String s = aList.get(1);
		System.out.println("Element at 1st indx is "+s);
		System.out.println();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
