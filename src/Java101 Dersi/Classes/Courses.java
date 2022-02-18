package Classes;

public class Courses {

	static Courses	Math=new Courses("Math");
    static Courses Phys=new Courses("Phys");
    static Courses Art=new Courses("Art");
    static Courses Music=new Courses("Music");

	Teachers courseTeacher=null;

	String prefix;
	int grade;
	int perfGrade;
	Double Avrg;
	
	
	public Courses(String prefix) {
	    
		this.prefix=prefix;
		this.grade=0;
		this.perfGrade=0;
		this.Avrg=0.0;
		
		
		
		
	}
	
	public void addTeacher(Teachers t) {
		
		if(t.branch.equals(this.prefix)) {
		this.courseTeacher=t;
		System.out.println(t.name+" assigned to the "+ this.prefix+ " course.");
		}
		else {
			
		System.out.println("The assignment failed.");
		}
		printTeacher();
	}
		public void printTeacher() {
			
			if(courseTeacher !=null) {
				System.out.println("Teacher of "+this.prefix+" is "+courseTeacher.name);
				
			}else {
				System.out.println("There is no assigned teacher for "+this.prefix);
			}
			
			
		}
		
	
	
	
	
	
	
	
}
