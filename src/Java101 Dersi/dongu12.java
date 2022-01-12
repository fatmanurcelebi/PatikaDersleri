import java.util.Scanner;
public class dongu12 {

	public static void main(String[] args) {
		// ters yildiz
		
		Scanner inp=new Scanner(System.in);

		System.out.println("Basamak sayisi giriniz: ");
		int n= inp.nextInt();	
		
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=i-1;k++) {
				
				System.out.print(" ");
				   
			} for(int m=(2*n-2*i+1);m>=1;m--) {
			     System.out.print("*");
					
			     
		}
			System.out.println(" ");
		
			
			
			
			
		}
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
