package assignment;

class Animal2{
	void eat(){
		System.out.println("Eating");
	}
}

class Dog2 extends Animal2{
	void eat(){
		System.out.println("eating bread");
	}
	void bark() {
		System.out.println("barking");
		
	}
	void work() {
		super.eat(); //super is used to invoke parent class method(eat() in Animal2)
		bark();
	}
}

public class SuperExample2 {
	public static void main(String[] args) {
	Dog2 d2 = new Dog2();	
	d2.work();
	}
}
