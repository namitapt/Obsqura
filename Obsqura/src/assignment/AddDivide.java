package assignment;
import java.util.Scanner;
public class AddDivide {

	public static void main(String[] args) {
		Add obj = new Add();
		int x,y,res;
		System.out.println("Enter the numbers that are to be added");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		res=obj.add(x,y);
		System.out.println("Sum is "+res);
		sc.close();
	}
}
