package assignment;

public class StudentGrade {
	String myname;
	int english, math, science;

	StudentGrade (String name, int n1, int n2, int n3) {
	myname=name;
	english=n1;
	math=n2; 
	science=n3;
	}
	int display () {
		System.out.println("Name: "+this.myname); 
		System.out.println("Science: "+this.science); 
		System.out.println("English: "+this.english); 
		System.out.println("Math: "+this.math);
		int total=this.english+this.math+this.science; 
		return total;
	}
	void chkGrade (int mark) {
		if ((mark>=120) && (mark<=149))
			System.out.println("The student grade is Grade D ");
		 else if ((mark>=150) && (mark<=199))
			 System.out.println("The student grade is Grade C ");
		else if ((mark>=200) && (mark<=280)) 
			System.out.println("The student grade is Grade B ");
		else if ((mark>=281) && (mark<=300))
			System.out.println("The student grade is Grade A ");
		else
			System.out.println("The student Failed");
	}
	public static void main(String[] args) {
		StudentGrade objl=new StudentGrade ("Jimmy", 86, 69,87);
		System.out.println("First Student Details");
		int totalMark=objl.display();
		objl.chkGrade (totalMark);
		StudentGrade obj2=new StudentGrade ("Abhi", 45,53,78);
		System.out.println("Second Student Details");
		totalMark = obj2.display();
		obj2.chkGrade (totalMark);
	}

}
