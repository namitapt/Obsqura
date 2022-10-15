package assignment;

class FinalVariable {
	final int speed = 60; //final keyword with variable indicates it cannot be changed
	void run() {
		//speed = 80; 
		System.out.println("The speed is:"+speed);
}
	public static void main(String[] args) {
		FinalVariable fv = new FinalVariable();
		fv.run();
	}
}
