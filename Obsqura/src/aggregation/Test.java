package aggregation;
//exception : array index out of bound
//try catch
public class Test {
	
	public static void main(String[] args) {
		try {
		int a[] = {1,2,3};
		System.out.println(a[10]);
		}
		catch(Exception e) {
			System.out.println("Something went wrong!!! "+e);
		}
		/*finally {
			System.out.println("Try Catch finished!!!");
		}*/
		System.out.println();
	}

}
