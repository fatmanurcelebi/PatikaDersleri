import java.util.Scanner;
public class RecursivePrimeNumber {
	// Finding Prime Number with using recursive method.
	
	public static void main(String[] args) {
	while(true) {
	Scanner inp=new Scanner(System.in);	
	System.out.println("Enter a number: ");	
    int n=inp.nextInt();
	boolean result= prime(n,n-1);
    if(result) {
    	System.out.println(n+" is a prime number.");
    	
    }
    else {
    	System.out.println(n+" is not a prime number.");
    }
	}	
	}

	static boolean prime(int n, int i){
	    if(i==1) {
	        return true;}
	    if(n%i==0) {
	        return false;}
	    else {
	        return prime(n,i-1);
	}
		
			
			
		}
	


}
	
		
	
	
	
	

