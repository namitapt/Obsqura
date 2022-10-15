package assignment;

public class ReverseNum {
	int reverse;
ReverseNum(int n){
	
	while(n!=0) {
		int reminder = n%10;
		reverse = reverse * 10 + reminder;
		n=n/10;
	}
}
ReverseNum(){
	this(123);
	System.out.println("Finding reverse....");
	System.out.println("Reverse is "+reverse);
}

	public static void main(String[] args) {
		new ReverseNum();
	}

}
