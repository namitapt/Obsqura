package abstracteg;

abstract class AnimalAb{
	public void eat() {
		System.out.println("Eat's food");
	}
	abstract public void breed();
}
class DogAb extends AnimalAb{
	public void eat() {
		System.out.println("Dog eats meat");
	}
	public void breed() {
		System.out.println("Dog breed is Pomeranian");
	}
}
public class AbstractAnimalDog {
	public static void main(String[] args) {
		DogAb dab = new DogAb();
		dab.eat();
		dab.breed();
	}

}
