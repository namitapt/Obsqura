package assignment;

public class Student {
String name;
int sub1;
int sub2;
int sub3;
Student(String n,int  m1, int m2, int m3){
	name=n;
	sub1=m1;
	sub2=m2;
	sub3=m3;
	
}

int totalMark() {
	System.out.println(name+" "+sub1+" "+sub2+" "+sub3);
	int tMarks=this.sub1+this.sub2+this.sub3;
	return tMarks;
}

void sumMark(int mark) {
	if((mark>=251)&&(mark<=300)) 
		System.out.println("Grade A");
	else if((mark>=201)&&(mark<=250)) 
		System.out.println("Grade B");
	else if((mark>=151)&&(mark<=200)) 
		System.out.println("Grade C");
	else if((mark>=101)&&(mark<=150)) 
		System.out.println("Grade B");
	else 
		System.out.println("Failed");
}

	public static void main(String[] args) {
		Student s1 = new Student("Namita",88,76,99);	
		int stm1 = s1.totalMark();
		s1.sumMark(stm1);
		Student s2 = new Student("Nikhitha",80,89,99);
		int stm2 = s2.totalMark();
		s2.sumMark(stm2);
	}
}
