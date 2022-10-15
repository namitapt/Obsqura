package assignment;

class Animal3{
	Animal3(){
		System.out.println("Animal is created");
	}
}
class Dog3 extends Animal3{
	Dog3(){
		super();
		System.out.println("Dog is created");
	}
}
public class SuperExample3 {

	public static void main(String[] args) {
		Dog3 d3 = new Dog3();
	}
}
