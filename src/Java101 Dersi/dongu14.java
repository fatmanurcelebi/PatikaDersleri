import java.util.Scanner;
public class dongu14 {

	public static void main(String[] args) {
		// Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

		
		Scanner inp=new Scanner(System.in);
		System.out.println("Fibonacci serisinin eleman sayisini giriniz: ");
		int n=inp.nextInt();
		int first=0;
		int second=1;
		int sum;
		System.out.print("Fibonacci Serisi:0,1");
		for(int i=1;i<n;i++) {
			
			sum=first+second;
			first=second;
			second=sum;
			
			System.out.print(","+sum);
			
			
			
		}
		
		
		
	}

}
