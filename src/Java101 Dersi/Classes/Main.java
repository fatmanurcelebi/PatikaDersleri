package Classes;

public class Main {
	
	static Students s1 =new Students(4,"Ali",234);
	static Students s2 =new Students(4,"Can",547);
	
	public static void main(String[] args) {
		
		
		//Assignment Teachers;
		
		Courses.Math.addTeacher(Teachers.t1);
		Courses.Phys.addTeacher(Teachers.t2);
		Courses.Art.addTeacher(Teachers.t3);
		Courses.Music.addTeacher(Teachers.t4);
		
		//Selecting Courses and Calculating grades and status.
		
		System.out.println("*****WELCOME*****");
		
		s1.selectCourse(s1.name);
		s1.isPass(s1.name);
		
		s2.selectCourse(s2.name);
		s2.isPass(s2.name);
		
	
	}

}
