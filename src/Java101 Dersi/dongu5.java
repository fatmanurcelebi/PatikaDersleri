import java.util.Scanner;	
public class dongu5 {

	public static void main(String[] args) {
		// 3 basamakl� Armstrong Say�lar�n� bul.
		
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("3 basamakl� Armstrong Say�lar: ");
		
		
		for(int n=100;n<=999 ; n++) {
			
		int tempnumber=n;
		int basamakdegeri;
		
		int	toplam=0;
		int basamaksay�s�=0;
		
		while(tempnumber!=0) {
			
		tempnumber/=10;
		basamaksay�s�++;
		}
		
		tempnumber=n;
		
		while(tempnumber!=0) {
			int baspower=1;
			basamakdegeri=tempnumber %10;
			for(int i=1 ;i <= basamaksay�s�;i++) {
				
				baspower*=basamakdegeri;
				
				
				
			}
			toplam += baspower;
			tempnumber/=10;	
			
		}	
			if (toplam == n) {
	            System.out.println(n);
	        } 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
