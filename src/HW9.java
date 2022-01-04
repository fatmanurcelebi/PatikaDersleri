import java.util.Scanner;
public class HW9 {

	public static void main(String[] args) {
		
		//Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		//Geçme Notu : 55
		//girilen ders notlarý 0ve100 arasýnda deðil ise ortalamaya katýlmasýn.
		
		
		Scanner inp= new Scanner(System.in);
		
		int mat,tur,fiz,kim,muz,toplam=0,sayý=0 ;
		
		System.out.println("Lütfen matemetik notunuzu giriniz: ");
		mat=inp.nextInt();
		
		System.out.println("Lütfen türkçe notunuzu giriniz: ");
		tur= inp.nextInt();
		
		System.out.println("Lütfen fizik notunuzu giriniz: ");	
		fiz=inp.nextInt();
		
		System.out.println("Lütfen kimya notunuzu giriniz: ");
		kim=inp.nextInt();
		
		System.out.println("Lütfen müzik notunuzu giriniz: ");
		muz=inp.nextInt();
		
		boolean cmat= mat>0 && mat<100 ;
		boolean ctur= tur>0 && tur<100 ;
		boolean cfiz= fiz>0 && fiz<100 ;
		boolean ckim= kim>0 && kim<100 ;
		boolean cmuz= muz>0 && muz<100 ;
		
		if(cmat) {
			toplam+=mat ;
			sayý++;
		}
		if(ctur) {
			toplam+=tur;
			sayý++;
		}
		if(cfiz) {
			toplam+=fiz;
			sayý++;
		}
		if(ckim) {
			toplam+=kim;
			sayý++;
		}
		if(cmuz) {
			toplam+=muz;
			sayý++;
		}
		
		
		
		
		double avrg= (toplam)/sayý;
		
		if(avrg<55) {
			System.out.println("Sýnýfta kaldýnýz...");
		}
		else {
				
			System.out.println("Tebrikler sýnýfý geçtiniz.");
				}
			
			System.out.println("Ortalamanýz: "+ avrg);
		
	}
		
	}


