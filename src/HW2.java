import java.util.Scanner ;

public class HW2 {

	public static void main (String[]args) {
//Eðer girilen tutar 0 ve 1000 TL arasýnda ise KDV oraný %18 , 
//tutar 1000 TL'den büyük ise KDV oranýný %8 olarak KDV tutarý hesaplayan programý yazýnýz.

		Scanner input= new Scanner(System.in); 
		
		double Tutar, KDVoraný, KDVtutarý, ToplamTutar ;
		System.out.println("Lütfen Tutarý Giriniz: ");
		
		Tutar = input.nextDouble();
		boolean sonuc = Tutar<1000 && Tutar>0 ;
	
		KDVoraný = sonuc ? 0.18 : 0.08 ;
		
		System.out.println("KDV Oraný:"+ KDVoraný );
		
		KDVtutarý = KDVoraný*Tutar;
		System.out.println("KDV Tutarý:" + KDVtutarý);
		
		ToplamTutar= Tutar+KDVtutarý ;
		System.out.println("Toplam Ödemeniz: " + ToplamTutar);
		
		
		
		
	}

}
