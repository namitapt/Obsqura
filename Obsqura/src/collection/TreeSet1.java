package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1{

	public static void main(String[] args) {
		
		int b[] = {1,5,3,4,0,2};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int j=0;j<b.length;j++) {
			ts.add(b[j]);
		}
		System.out.println(ts);
	}
}


