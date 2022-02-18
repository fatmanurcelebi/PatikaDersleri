
package Classes;
import java.util.Scanner;
public class Students {
	
	static	Courses c1=null;
	static	Courses c2=null;
	static	Courses c3=null;
	
	String name;
	int stNumber;
	int classes;
	

	


	
	
	public Students(int classes,String name,int stNumber){
		this.name=name;
		this.stNumber=stNumber;
		this.classes=classes;
		
		
	}
	
	public void selectCourse(String name) {
	
		Scanner inp=new Scanner(System.in);
		System.out.println("Select courses for "+ name);
		System.out.println("Courses: 1.Math,2.Phys,3.Art,4.Music");
		System.out.println("What is student's first course(Please write a number(1-4):  ");
		int a= inp.nextInt();
		switch(a){
		
		case 1:
			c1=Courses.Math;
			break;
		case 2:
			c1=Courses.Phys;
			break;
		case 3:
			c1=Courses.Art;
			break;
		case 4:
			c1=Courses.Music;
			break;
		default:
			System.out.println("Please select a number between 1 and 4.");
		}
	
	
		System.out.println("What is student's second course: ");
		int b= inp.nextInt();
		if(b!=a) {
		switch(b){
		case 1:
			c2=Courses.Math;
			break;
		case 2:
			c2=Courses.Phys;
			break;
		case 3:
			c2=Courses.Art;
			break;
		case 4:
			c2=Courses.Music;
			break;
		default:
			System.out.println("Please select a number between 1 and 4.");
		}}else {
			System.out.println("Please select different course!");
		}
		
		
		System.out.println("What is student's third course:  ");
		int c= inp.nextInt();
		if(c!=a && c!=b) {
		switch(c){
		case 1:
			c3=Courses.Math;
			break;
		case 2:
			c3=Courses.Phys;
			break;
		case 3:
			c3=Courses.Art;
			break;
		case 4:
			c3=Courses.Music;
			break;
		default:
			System.out.println("Please select a number between 1 and 4.");
		}}else {
			System.out.println("Please select different course!");
			}
		
		
		System.out.println("Selected courses for "+name+" :"+c1.prefix+", "+c2.prefix+", "+c3.prefix);
		
	}
		
		
		
		
		
		
	
	
	public void addGrades(String name) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Adding grades for "+ name);
		System.out.println("What is grade of " +c1.prefix+" ?:");
		int gradec1=inp.nextInt();
		if(gradec1 >=0 && gradec1<=100) {
		 c1.grade=gradec1;	
		}
		
		System.out.println("What is performance grade of " +c1.prefix+" ?:");
		int gradePerfc1=inp.nextInt();
		if(gradePerfc1 >=0 && gradePerfc1<=100) {
			c1.perfGrade=gradePerfc1;	
		}
		System.out.println("What is grade of " +c2.prefix+" ?:");
		int gradec2=inp.nextInt();
		if(gradec2 >=0 && gradec2<=100) {
			c2.grade=gradec2;	
		}
		System.out.println("What is performance grade of " +c2.prefix+" ?:");
		int gradePerfc2=inp.nextInt();
		if(gradePerfc2 >=0 && gradePerfc2<=100) {
			c2.perfGrade=gradePerfc2;	
		}
		System.out.println("What is grade of " +c3.prefix+" ?:");
		int gradec3=inp.nextInt();
		if(gradec3 >=0 && gradec3<=100) {
			c3.grade=gradec3;	
		}
		System.out.println("What is performance grade of " +c3.prefix+" ?:");
		int gradePerfc3=inp.nextInt();
		if(gradePerfc3 >=0 && gradePerfc3<=100) {
			c3.perfGrade=gradePerfc3;	
		}
		
	
		
		
		
		
		
		
		
	
	}
	
	
	public void calcAvarage() {
		double c1Avrg= c1.grade*0.7+c1.perfGrade*0.3;
		c1.Avrg=c1Avrg;
		System.out.println("The final grade for "+c1.prefix+" is= "+c1.Avrg);
		double c2Avrg= c2.grade*0.7+c2.perfGrade*0.3;
		c2.Avrg=c2Avrg;
		System.out.println("The final grade for "+c2.prefix+" is= "+c2.Avrg);
		double c3Avrg= c3.grade*0.7+c3.perfGrade*0.3;
		c3.Avrg=c3Avrg;
		System.out.println("The final grade for "+c3.prefix+" is= "+c3.Avrg);
		
		
	}
	
	
	public void isPass(String name) {
		System.out.println("Status for "+name);
		addGrades(name);
		calcAvarage();
		if(c1.Avrg>=60) {
			System.out.println("Course: "+c1.prefix+"Status: Passed");
		}
		else {
			System.out.println("Course: "+c1.prefix+"Status: Failed");
			
		}
		
		if(c2.Avrg>=60) {
			System.out.println("Course: "+c2.prefix+"Status: Passed");
		}
		else {
			System.out.println("Course: "+c2.prefix+"Status: Failed");
			
		}
		
		if(c3.Avrg>=60) {
			System.out.println("Course: "+c3.prefix+"Status: Passed");
		}
		else {
			System.out.println("Course: "+c3.prefix+"Status: Failed");
			
		}
	}
	
	
	
	
	
	
	
	
}
