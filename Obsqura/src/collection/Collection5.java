package collection;

import java.util.ArrayList;

public class Collection5 {

	public static void main(String[] args) {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(12);
		al2.add(23);
		al2.add(34);
		al2.add(45);
		al2.add(56);
		System.out.println(al2.size()+" is the size.");
		for(int n:al2) {
			System.out.println(n);
		}
		al2.remove(2);
		System.out.println("After removing:");
		for(int n:al2) {
			System.out.println(n);
		}
		System.out.println(al2.size()+" is the new size");

	}

}
