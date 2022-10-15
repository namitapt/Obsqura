package thisexamples;

//this: to pass as an argument in the method

public class This4 {
void show(This4 obj) {
	System.out.println("Method is invoked");
}
void display() {
	show(this);
}
	public static void main(String[] args) {
		This4 t4 = new This4();
		t4.display();
	}
}
