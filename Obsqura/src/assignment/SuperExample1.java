package assignment;

class Animal{
	protected String type = "animal";
}
class Dog extends Animal{
	public String type = "mammal";
	
	public void printTypes() {
		System.out.println("I am a "+type);
		System.out.println("I am an "+super.type);
	}
}

public class SuperExample1 {
	public static void main(String[] args) {
	Dog dog1 = new Dog();
	dog1.printTypes();
	}
}
