import java.util.Scanner ;

public class HW2 {

	public static void main (String[]args) {
//E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , 
//tutar 1000 TL'den b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplayan program� yaz�n�z.

		Scanner input= new Scanner(System.in); 
		
		double Tutar, KDVoran�, KDVtutar�, ToplamTutar ;
		System.out.println("L�tfen Tutar� Giriniz: ");
		
		Tutar = input.nextDouble();
		boolean sonuc = Tutar<1000 && Tutar>0 ;
	
		KDVoran� = sonuc ? 0.18 : 0.08 ;
		
		System.out.println("KDV Oran�:"+ KDVoran� );
		
		KDVtutar� = KDVoran�*Tutar;
		System.out.println("KDV Tutar�:" + KDVtutar�);
		
		ToplamTutar= Tutar+KDVtutar� ;
		System.out.println("Toplam �demeniz: " + ToplamTutar);
		
		
		
		
	}

}
