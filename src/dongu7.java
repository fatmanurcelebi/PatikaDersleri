import java.util.Scanner;
public class dongu7 {

	public static void main(String[] args) {
		// ekrana *'lardan elmas basma
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Elmas þekli için bir sayý giriniz: ");
		int n=inp.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			}

		for(int m=1;m<=n-1;m++) {
			for(int p=1;p<=m;p++) {
				System.out.print(" ");
			}
				
			for(int r=1;r<=2*n-2*m-1;r++) {
				System.out.print("*");
				
			}
			System.out.println();	
				
			
			
			
			
			
			
		}
		
		
		
		
	}

}
