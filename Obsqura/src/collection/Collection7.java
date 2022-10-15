package collection;

import java.util.ArrayList;

//Contains String
public class Collection7 {

	public static void main(String[] args) {
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Dog");
		al4.add("Cat");
		al4.add("Cow");
		al4.add("Monkey");
		boolean b2 = al4.contains("Monkey");
		if(b2) {
			System.out.println("The list contains Monkey");
		}
		else {
			System.out.println("The list does not contain Monkey");
		}
		b2 = al4.contains("Donkey");
		if(b2) {
			System.out.println("The list contains Donkey");
		}
		else {
			System.out.println("The list does not contain Donkey");
		}
		boolean b3 = al4.isEmpty();
		System.out.println(b3);
		if(b3) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
		}
	}

}
