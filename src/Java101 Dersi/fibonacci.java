
public class fibonacci {

	
	//recursive fibonacci 
		
	static int fib(int n) {
			
			if(n==2 || n==1) {
			return 1;	
				
			}
			return fib(n-1)+fib(n-2); 
		}
		
		
		
	public static void main(String[] args) {

	System.out.println(fib(6));
	
	
	
	}

}
