import java.util.Scanner;
public class odev1 {

	public static void main(String[] args) {
		//  0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam b�l�nen say�lar�n ortalamas�n� hesaplayan program
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Say� giriniz: ");
		int say�= inp.nextInt();
		int toplam=0,ortalama,count=0;
		for(int i=1;i<=say�;i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				count++;
				System.out.println("0 ile "+say�+"aras�ndaki say�lardan 3 ve 4e tam b�l�nen say� "+count+": "+i);
			}
			
			
			
			
			
		}
		ortalama= toplam/count;
		
	
		System.out.println("0 ile "+say�+"'aras�ndaki say�lardan 3 ve 4e tam b�l�nen say�lar�n ortalamas�; "+ortalama);
		
		

	}

}
