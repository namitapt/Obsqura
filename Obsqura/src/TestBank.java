class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank{
	@Override
	int getRateOfInterest() {
		return 7;
	}
}

class Canara extends Bank{
	@Override
	int getRateOfInterest() {
		return 6;
	}
}

public class TestBank {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		Canara c = new Canara();
		System.out.println("Rate of interest in SBI: "+s.getRateOfInterest());
		System.out.println("Rate of interest in ICICI: "+i.getRateOfInterest());
		System.out.println("Rate of interest in Canara: "+c.getRateOfInterest());
	}

}
