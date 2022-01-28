import java.util.Scanner;
public class RecursivePower {

	
	static int power (int a,int n) {
		int result=1;
	
	if(n==1) {
		return a;
	}else {
	result=a*power(a,n-1);
	return result ;
	}}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=inp.nextInt();
		System.out.println("Enter the second number: ");
		int n=inp.nextInt();	
		
		int result=power(a,n);
System.out.println(a+"^"+n+" = "+result);	
	}

}
