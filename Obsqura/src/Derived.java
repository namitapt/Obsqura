
public class Derived extends Base{
	public void M2() {
		System.out.println("Derived class Methods");
	}
	public static void main(String[] args) {
		Derived d = new Derived();
		d.M1();
		d.M2();
	}

}
