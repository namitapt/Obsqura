package assignment;

public class Divide extends Add{
public void divide(int sum) {
	System.out.println("The sum is "+super.s);
	if(super.s%10==0) {
		System.out.println("Result is divisible by 10");
	}
	else {
		System.out.println("Result not divisible by 10");
	}
	}
}