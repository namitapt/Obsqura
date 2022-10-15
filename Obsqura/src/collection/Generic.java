package collection;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		ArrayList<String> g = new ArrayList<String>();//Generic
		g.add("Red");
		g.add("Blue");
		g.add("Green");
		g.add("Yellow");
		System.out.println(g);
		String s = g.get(0);
		System.out.println(s);
	}

}
