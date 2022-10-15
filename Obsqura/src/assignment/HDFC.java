package assignment;

public class HDFC implements RBI{
	public void recurringDeposit(float amount, float duration) {
		float tAmount = amount * duration * interestRate;
		System.out.println("The amount after depositing of the given period of time is:"+tAmount);
	}
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.recurringDeposit(1000, 6);
	}
}
