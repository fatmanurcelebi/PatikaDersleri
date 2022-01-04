import java.util.Scanner;
public class HW13 {

	public static void main(String[] args) {
		// uçak bileti hesaplama
		
		Scanner inp= new Scanner(System.in);
		Double mesafe,yas,toplam,yasİndirim=0.0,turİndirim=0.0,Yİ,Tİ,ST,SonTutar;
		int tur;
		System.out.println("Mesafeyi km cinsinden giriniz:  ");
		mesafe=inp.nextDouble();
		System.out.println("Yaşınızı giriniz:  ");
		yas=inp.nextDouble();
		System.out.println("Yolculuk türünü giriniz: \n1-Gidiş\n2-Gidiş-Dönüş  ");
		tur=inp.nextInt();
		
		if(!(mesafe>0.0 && yas>0.0 && (tur==1 || tur==2))) {
			 System.out.println("Hatalı veri girdiniz. ");
			 
		 }else {
		 
			 
		 if(yas<12) {
			 yasİndirim=0.5;
			 
		 }
		 else if( yas>=12 && yas<24) {
			 yasİndirim=0.1;
			 
		 }else if(yas>=24 && yas<65) {
			 yasİndirim=0.0;
			 
		 }
		 
		 else if(yas>=65) {
			 yasİndirim=0.3;
			 
		 }
			 
			 
		
		if(tur==1) {
			turİndirim=0.0;
		}
		else if(tur==2) {
			turİndirim=0.2;
		}
		
		toplam=mesafe*0.10;
		Yİ=toplam*yasİndirim;
		ST=toplam-Yİ;
		Tİ=ST*turİndirim;
		SonTutar=(ST-Tİ)*tur;
		
		System.out.println("İndirimsiz Toplam"+ toplam);
		System.out.println("Yaş İndirimi: "+ Yİ);
		System.out.println("Gidiş-Dönüş İndirimi"+Tİ);
		System.out.println("İndirimli Toplam Fiyat: "+ SonTutar);
		
		
		

	}

}
}
