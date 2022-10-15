package assignment;

public class exceptionHandling {

	public static void main(String[] args) {
		try {
			int a = 50/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("try catch finished!!");
			int x=10,y=15,z;
			z=x+y;
			System.out.println("Sum of "+x+" and "+y+" is "+z);
		}
	}
}
