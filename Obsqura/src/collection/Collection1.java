package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Namita");
		list.add("Gopika");
		list.add("Shamna");
		list.add("Jimsha");
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		/*for(String s: list) {
			System.out.println(s);
		}*/
	}

}
