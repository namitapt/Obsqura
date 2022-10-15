package collection;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {
		ArrayList ng = new ArrayList();//Generic
		ng.add("Red");
		ng.add("Blue");
		ng.add("Green");
		ng.add("Yellow");
		System.out.println(ng);
		String s = (String)ng.get(0); //TypeCasting
		System.out.println(s);
		
	}

}
