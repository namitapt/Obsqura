class Bike{
	void run() {
		System.out.println("Running");
	}
}
public class Splender extends Bike{
	void run() {
		System.out.println("Running safely @60kmph");
	}

	public static void main(String[] args) {
		Bike b = new Splender();
		b.run();
	}

}
