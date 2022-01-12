import java.util.Scanner;

public class dongu13 {

	public static void main(String[] args) {
		// 1-100 arasi asal sayiler

		Scanner inp=new Scanner(System.in);

		Boolean asal=true;
		int n=0;
		System.out.print("1-100 arasi asal sayilar:  ");
		
		for(int i=2;i<=100;i++) {
			asal=true;
			for(int k=i-1;k>1;k--) {

				if(i%k==0 ) {
					asal=false;
					break;
				}	}
			
		
			if(asal) {
				
				System.out.print(i+",");
			
			
			
			
		}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
