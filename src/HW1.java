	import java.util.Scanner;
public class HW1 {

	public static void main(String[] args) {
	

		    Scanner inp = new Scanner(System.in)	;
				
			int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik	;
				
				System.out.println("Matematik notunuzu giriniz: " );
				Matematik= inp.nextInt();
				
				System.out.println("Fizik notunuzu giriniz: " );
				Fizik= inp.nextInt();
				
				System.out.println("Kimya notunuzu giriniz: " );
				Kimya= inp.nextInt();
				
				System.out.println("Türkçe notunuzu giriniz: " );
				Türkçe= inp.nextInt();
				
				System.out.println("Tarih notunuzu giriniz: " );
				Tarih= inp.nextInt();
				
				System.out.println("Müzik notunuzu giriniz: " );
				Müzik= inp.nextInt();
				
				
				int NotOrtalamasý = (Matematik +Fizik+ Kimya+ Türkçe+ Tarih+ Müzik)/ 6 ;
				
				System.out.println("Not Ortalamanýz=  " + NotOrtalamasý );
				
				boolean sonuc = NotOrtalamasý >= 60 ;
				
				String str = sonuc ? "Sýnýfý Geçtiniz " : "Sýnýfý Geçemediniz" ;
				
				System.out.println(str);
				
			}

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
