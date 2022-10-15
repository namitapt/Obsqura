import java.util.Scanner;

class Account{
	static double balance = 15000;
	public static double ab;
	public double deposit(double d) {
		return balance = balance + d;
	}
	public static double withdraw(double w) {
		return balance = balance - w;
	}
	public static double abalance(double ab) {
		balance=ab;
		return ab;
	}
}
public class BankAccount {

	public static void main(String[] args) {
		System.out.println("Enter");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Balance");
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the amount to be withdran:");
			double wamt = sc.nextDouble();
			double wbal = a.withdraw(wamt);
			System.out.println("Current account balance is:"+wbal);
			break;
		case 2:
			System.out.println("Enter the amount to be deposited:");
			double damt = sc.nextDouble();
			double dbal = Account.withdraw(damt);
			System.out.println("Current account balance is:"+dbal);
			break;
		case 3:
			double abal = a.abalance(Account.ab);
			System.out.println("Account balance is:"+abal);
			break;
		}

	}

}
