package collection;

import java.util.ArrayList;

public class CollectionRetainAll {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(12);
		al1.add(23);
		al1.add(34);
		al1.add(45);
		al1.add(56);
		System.out.println("List 1 contains:"+al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(98);
		al2.add(23);
		al2.add(87);
		al2.add(76);
		al2.add(56);
		System.out.println("List 2 contains:"+al2);
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al2);
	}
}
