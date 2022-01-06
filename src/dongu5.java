import java.util.Scanner;	
public class dongu5 {

	public static void main(String[] args) {
		// 3 basamaklý Armstrong Sayýlarýný bul.
		
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("3 basamaklý Armstrong Sayýlar: ");
		
		
		for(int n=100;n<=999 ; n++) {
			
		int tempnumber=n;
		int basamakdegeri;
		
		int	toplam=0;
		int basamaksayýsý=0;
		
		while(tempnumber!=0) {
			
		tempnumber/=10;
		basamaksayýsý++;
		}
		
		tempnumber=n;
		
		while(tempnumber!=0) {
			int baspower=1;
			basamakdegeri=tempnumber %10;
			for(int i=1 ;i <= basamaksayýsý;i++) {
				
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
