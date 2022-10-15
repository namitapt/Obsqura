package thisexamples;
//this: to invoke current class method
public class Athis2 {
	void m() {
		System.out.println("Hello m");
	}
	void n() {
		System.out.println("Hello n");
		this.m();
	}

}
