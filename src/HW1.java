	import java.util.Scanner;
public class HW1 {

	public static void main(String[] args) {
	

		    Scanner inp = new Scanner(System.in)	;
				
			int Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik	;
				
				System.out.println("Matematik notunuzu giriniz: " );
				Matematik= inp.nextInt();
				
				System.out.println("Fizik notunuzu giriniz: " );
				Fizik= inp.nextInt();
				
				System.out.println("Kimya notunuzu giriniz: " );
				Kimya= inp.nextInt();
				
				System.out.println("T�rk�e notunuzu giriniz: " );
				T�rk�e= inp.nextInt();
				
				System.out.println("Tarih notunuzu giriniz: " );
				Tarih= inp.nextInt();
				
				System.out.println("M�zik notunuzu giriniz: " );
				M�zik= inp.nextInt();
				
				
				int NotOrtalamas� = (Matematik +Fizik+ Kimya+ T�rk�e+ Tarih+ M�zik)/ 6 ;
				
				System.out.println("Not Ortalaman�z=  " + NotOrtalamas� );
				
				boolean sonuc = NotOrtalamas� >= 60 ;
				
				String str = sonuc ? "S�n�f� Ge�tiniz " : "S�n�f� Ge�emediniz" ;
				
				System.out.println(str);
				
			}

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
