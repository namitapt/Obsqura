package assignment;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Java");
		String s3 = new String("hello");
		String s4 = new String("Hello");
		StringBuffer sb1 = new StringBuffer("Welcome");
		StringBuffer sb2 = new StringBuffer("Java");
		StringBuffer sb3 = new StringBuffer("Python");
		StringBuffer sb4 = new StringBuffer("Software");
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(sb1.append(sb2));
		System.out.println(sb3.insert(2, sb2));
		System.out.println(sb4.replace(1, 3, s2)); //**
	
	}

}
