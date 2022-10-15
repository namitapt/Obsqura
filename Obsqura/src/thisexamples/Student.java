package thisexamples;

//this: to refer the current class instance variable

public class Student {
		int rnum;
		String name;
		Student(int rnum,String name){
			this.rnum=rnum;
			this.name =name;
		}
		void display() {
			System.out.println(rnum+" "+name);
		}
}
