package assignment;

public class TotalSalary extends HraPf{
	double total;
	void totalSalary() {
		double total = (basicPay+hra-pf-deduction+bonus);
		this.total=total;
	}
}
