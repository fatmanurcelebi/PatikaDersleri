import java.util.Scanner;
public class odev1 {

	public static void main(String[] args) {
		//  0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e tam bölünen sayýlarýn ortalamasýný hesaplayan program
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Sayý giriniz: ");
		int sayý= inp.nextInt();
		int toplam=0,ortalama,count=0;
		for(int i=1;i<=sayý;i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				count++;
				System.out.println("0 ile "+sayý+"arasýndaki sayýlardan 3 ve 4e tam bölünen sayý "+count+": "+i);
			}
			
			
			
			
			
		}
		ortalama= toplam/count;
		
	
		System.out.println("0 ile "+sayý+"'arasýndaki sayýlardan 3 ve 4e tam bölünen sayýlarýn ortalamasý; "+ortalama);
		
		

	}

}
