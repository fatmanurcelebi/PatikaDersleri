import java.util.Scanner;	
public class dongu5 {

	public static void main(String[] args) {
		// 3 basamaklı Armstrong Sayılarını bul.
		
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("3 basamaklı Armstrong Sayılar: ");
		
		
		for(int n=100;n<=999 ; n++) {
			
		int tempnumber=n;
		int basamakdegeri;
		
		int	toplam=0;
		int basamaksayısı=0;
		
		while(tempnumber!=0) {
			
		tempnumber/=10;
		basamaksayısı++;
		}
		
		tempnumber=n;
		
		while(tempnumber!=0) {
			int baspower=1;
			basamakdegeri=tempnumber %10;
			for(int i=1 ;i <= basamaksayısı;i++) {
				
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
