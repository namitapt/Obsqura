package collection;

import java.util.ArrayList;

public class Collection4 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Cat");
		al1.add("Dog");
		al1.add("Elephants");
		al1.add("Cow");
		System.out.println(al1);
		al1.remove(2);
		System.out.println(al1);
		al1.remove(2);
		System.out.println(al1);
	}

}
