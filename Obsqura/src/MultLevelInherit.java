class Animals{
	void eat() {
		System.out.println("eating");
	}
}
class Cat extends Animals{
	void meow() {
		System.out.println("barking");
	}
}
class Persian extends Cat{
	void friendly() {
		System.out.println("Home friendly");
	}
}
public class MultLevelInherit {

	public static void main(String[] args) {
		Persian p = new Persian();
		p.friendly();
	}
}
