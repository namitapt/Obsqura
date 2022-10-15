package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		int a[] = {2,6,3,5,1,4};
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0; i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		
		Set<Integer> ts = new TreeSet<Integer>(s);
		System.out.println(ts);
		
	}

}
