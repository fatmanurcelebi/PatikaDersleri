import java.util.Scanner;
public class HW9 {

	public static void main(String[] args) {
		
		//Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
		//Ge�me Notu : 55
		//girilen ders notlar� 0ve100 aras�nda de�il ise ortalamaya kat�lmas�n.
		
		
		Scanner inp= new Scanner(System.in);
		
		int mat,tur,fiz,kim,muz,toplam=0,say�=0 ;
		
		System.out.println("L�tfen matemetik notunuzu giriniz: ");
		mat=inp.nextInt();
		
		System.out.println("L�tfen t�rk�e notunuzu giriniz: ");
		tur= inp.nextInt();
		
		System.out.println("L�tfen fizik notunuzu giriniz: ");	
		fiz=inp.nextInt();
		
		System.out.println("L�tfen kimya notunuzu giriniz: ");
		kim=inp.nextInt();
		
		System.out.println("L�tfen m�zik notunuzu giriniz: ");
		muz=inp.nextInt();
		
		boolean cmat= mat>0 && mat<100 ;
		boolean ctur= tur>0 && tur<100 ;
		boolean cfiz= fiz>0 && fiz<100 ;
		boolean ckim= kim>0 && kim<100 ;
		boolean cmuz= muz>0 && muz<100 ;
		
		if(cmat) {
			toplam+=mat ;
			say�++;
		}
		if(ctur) {
			toplam+=tur;
			say�++;
		}
		if(cfiz) {
			toplam+=fiz;
			say�++;
		}
		if(ckim) {
			toplam+=kim;
			say�++;
		}
		if(cmuz) {
			toplam+=muz;
			say�++;
		}
		
		
		
		
		double avrg= (toplam)/say�;
		
		if(avrg<55) {
			System.out.println("S�n�fta kald�n�z...");
		}
		else {
				
			System.out.println("Tebrikler s�n�f� ge�tiniz.");
				}
			
			System.out.println("Ortalaman�z: "+ avrg);
		
	}
		
	}


