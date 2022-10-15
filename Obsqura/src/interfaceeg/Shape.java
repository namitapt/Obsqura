package interfaceeg;
//multiple inheritance
public class Shape implements Rectangle, Square{

	public void colorOfSquare() {
		System.out.println("Color of Square");
	}
	public void colorOfRectangle() {
		System.out.println("Color of Rectangle");
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		s.colorOfSquare();
		s.colorOfRectangle();
	}
}
