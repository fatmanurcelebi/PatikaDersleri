import java.util.Scanner;

public class plusAndMinus5 {
	static int tempN;
	static boolean isTrue=true;
	static int f(int n,int tempN,boolean isTrue) {
		
	   if(n>=0 && isTrue) {
		   System.out.print(" "+n);
		   return f(n-5,tempN,isTrue);
		   
		     }
	   else if(n<=0 || !isTrue && n<=tempN) {
		   System.out.print(" "+n);
	   isTrue=false;
		return f(n+5,tempN,isTrue);
	   }
	   
		
		return 0;
		}
	
	
	
	
	public static void main(String[] args) {
	
		
			Scanner inp=new Scanner(System.in);	
			System.out.println("Enter a number: ");	
		    int n=inp.nextInt();
		    tempN=n;
		    System.out.print("Pattern: ");	
		    f(n,n,isTrue);
		    
		    
		    

		}
		
	
	}
	










