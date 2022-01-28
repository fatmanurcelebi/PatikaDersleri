import java.util.Scanner;
public class Calculator {
	/*0-Exit 
	  1- Addition
	2- Subtraction
	3- Multiplication
	4- Division
	5- Power
	6- Factorial
	7- Mode
	8- Area and perimeter of the rectangle
*/
	
	
	static int add() {
		Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
	    int a=inp.nextInt(); 
		System.out.println("Second number: ");
		int b=inp.nextInt(); 
		int result= a+b;
		
		System.out.println(a+" + "+b+"= "+result);
		return result;
	}
	
    static int sub() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
    int a=inp.nextInt(); 
		System.out.println("Second number: ");
	int	b=inp.nextInt(); 
		int result= a-b;
		
		System.out.println(a+" - "+b+"= "+result);
		return result;
	}
	
    static int mul() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
	int a=inp.nextInt(); 
		System.out.println("Second number: ");
	int	b=inp.nextInt(); 
	int result= a*b;
	
	System.out.println(a+" x "+b+"= "+result);
	return result;
}
	
    static int div() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
	int a=inp.nextInt(); 
		System.out.println("Second number: ");
	int	b=inp.nextInt(); 
    	if(b==0) {
			
			System.out.println("A number cannot divided by zero");
			return 0;
		}
		else {
		int result= a/b;
		
		System.out.println(a+" / "+b+"= "+result);
		return result;
	}}
	
    static int pow() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
	int a=inp.nextInt(); 
		System.out.println("Second number: ");
	int	b=inp.nextInt(); 
    	int result=1;
		for(int i=1;i<=b;i++) {
			
			result*=a;
			}
		System.out.println(a+" ^ "+b+"= "+result);
		return result;
	}
	
    
    static int fac() {
    	int result=1;
    	Scanner inp=new Scanner(System.in);
		System.out.println("Number: ");
	 int a=inp.nextInt(); 
		for(int i=1; i<=a;i++) {
		
		result*=i;	
		}
		System.out.println(a+"! = "+result);
		return result;
	}
    
    
    static int mod() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First number: ");
	int a=inp.nextInt(); 
		System.out.println("Second number: ");
	int	b=inp.nextInt(); 
    	if(b==0) {
			
			System.out.println("A number cannot divided by zero");
			return 0;
		}
		else {
		int result= a%b;
		
		System.out.println(a+" mode "+b+"= "+result);
		return result;
	}}
    
    static int rec() {
    	Scanner inp=new Scanner(System.in);
		System.out.println("First side length: ");
	int a=inp.nextInt(); 
		System.out.println("Second side length: ");
	int	b=inp.nextInt(); 
		int area= a*b;
		int per=2*(a+b);
		System.out.println("Area= "+area+"	Perimeter= "+per);
		return 1;
		
	}
    

	public static void main(String[] args) {
		
    Scanner inp=new Scanner(System.in);
    String menu= "0-Exit\n"
    		+ "1- Addition\n" +
			"2- Subtraction\n" +
			"3- Multiplication\n"  +
			"4- Division\n" +
			"5- Power\n" +
			"6- Factorial\n" +
			"7- Mode\n" +
			"8- Area and perimeter of the rectangle";
	int select;
    System.out.println(menu);
    
	 do {
		System.out.print("Select an operation:");
		select=inp.nextInt();	
		
	
	switch(select) {
	
	case 0:
		System.out.println("Goodbye");
		break;	
	case 1:
		add();
		break;
	case 2:
		sub();
		break;
	case 3:
		mul();
		break;
	case 4:
		div();
		break;
	case 5:
		pow();
		break;
	case 6:
		fac();
		break;
	case 7:
		mod();
		break;
	case 8:
		rec();
		break;
	}}
	while(select!=0) ;
		
		
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
