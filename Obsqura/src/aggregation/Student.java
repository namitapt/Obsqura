package aggregation;

public class Student {
	int sRollNum;
	String sName;
	Address sAddress;
	public static void main(String[] args) {
		Address obj1 = new Address(1,"Kerala","India","Kannur");
		Student obj2 = new Student(101,"Namita",obj1);
		System.out.println(obj2.sRollNum);
		System.out.println(obj2.sName);
		System.out.println(obj2.sAddress.streetNum);
		System.out.println(obj2.sAddress.state);
		System.out.println(obj2.sAddress.country);
		System.out.println(obj2.sAddress.city);
	}
	Student(int rollNum, String name, Address address){
		this.sRollNum=rollNum;
		this.sName=name;
		this.sAddress=address;
	}
}
