package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Java");
		list2.add("Python");
		list2.add("C++");
		Iterator i2 = list2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		/*for(String s:list2) { //foreach loop
			System.out.println(s);
		}*/
		System.out.println(list2.size());
		}

}
