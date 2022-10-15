package assignment;

public class HraPf extends Salary{
		double pfCal,hraCal;
		void pfCal() {
			double pf = (basicPay*20)/100;
			this.pf=pf;
		}
		void hraCal() {
			double hra = (basicPay*5)/100;
			this.hra=hra;
		}
		
}
