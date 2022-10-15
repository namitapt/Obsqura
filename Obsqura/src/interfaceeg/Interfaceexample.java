package interfaceeg;

public class Interfaceexample implements Printable{
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Interfaceexample ieg = new Interfaceexample();
		ieg.print();
	}

}
