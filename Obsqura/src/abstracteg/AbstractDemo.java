package abstracteg;

abstract class BaseClass{
	abstract public void show1();
	
	public void show2() {
		System.out.println("Concrete method of parent class");
	}
}
class ChildClass extends BaseClass{
	public void show1() {
		System.out.println("Overriding the abstract method of parent class");
	}
	public void show2() {
		System.out.println("Overriding concrete method of the parent class");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		//BaseClass obj = new ChildClass(); 
		//BaseClass obj = new BaseClass(); /* An abstract class cannot be directly instantiated with the new operator*/
		obj.show1();
		obj.show2();
	}
}
