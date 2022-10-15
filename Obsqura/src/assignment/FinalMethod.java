package assignment;

public class FinalMethod {
	final void run() {
		System.out.println("Running");
	}
public class FinalMethodChild extends FinalMethod{
	/*void run() {
		System.out.println("Trying to run the extendend child class of final method");
	} */
}
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.run();
	}
}
