import java.util.Scanner;
public class HW13 {

	public static void main(String[] args) {
		// u�ak bileti hesaplama
		
		Scanner inp= new Scanner(System.in);
		Double mesafe,yas,toplam,yas�ndirim=0.0,tur�ndirim=0.0,Y�,T�,ST,SonTutar;
		int tur;
		System.out.println("Mesafeyi km cinsinden giriniz:  ");
		mesafe=inp.nextDouble();
		System.out.println("Ya��n�z� giriniz:  ");
		yas=inp.nextDouble();
		System.out.println("Yolculuk t�r�n� giriniz: \n1-Gidi�\n2-Gidi�-D�n��  ");
		tur=inp.nextInt();
		
		if(!(mesafe>0.0 && yas>0.0 && (tur==1 || tur==2))) {
			 System.out.println("Hatal� veri girdiniz. ");
			 
		 }else {
		 
			 
		 if(yas<12) {
			 yas�ndirim=0.5;
			 
		 }
		 else if( yas>=12 && yas<24) {
			 yas�ndirim=0.1;
			 
		 }else if(yas>=24 && yas<65) {
			 yas�ndirim=0.0;
			 
		 }
		 
		 else if(yas>=65) {
			 yas�ndirim=0.3;
			 
		 }
			 
			 
		
		if(tur==1) {
			tur�ndirim=0.0;
		}
		else if(tur==2) {
			tur�ndirim=0.2;
		}
		
		toplam=mesafe*0.10;
		Y�=toplam*yas�ndirim;
		ST=toplam-Y�;
		T�=ST*tur�ndirim;
		SonTutar=(ST-T�)*tur;
		
		System.out.println("�ndirimsiz Toplam"+ toplam);
		System.out.println("Ya� �ndirimi: "+ Y�);
		System.out.println("Gidi�-D�n�� �ndirimi"+T�);
		System.out.println("�ndirimli Toplam Fiyat: "+ SonTutar);
		
		
		

	}

}
}
