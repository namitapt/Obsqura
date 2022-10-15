package polymorphism;

public class Overloading3 {
	void sum(int a, int b) {
		System.out.println("Int argument method is invoked!");
	}
	void sum(double a, double b) {
		System.out.println("Double argument method is invoked!");
	}
	void sum(float a, float b) {
		System.out.println("Float argument method is invoked!");
	}
	public static void main(String[] args) {
		Overloading3 o3 = new Overloading3();
		o3.sum(12.3f, 13.4f);
	}

}
