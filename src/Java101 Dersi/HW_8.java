import java.util.Scanner;

public class HW_8 {

	public static void main(String[] args) {
		// // �ifre de�i�tirme
		
		 Scanner inp = new Scanner(System.in) ;
			String KullaniciAdi,Sifre;
			int cevap;
			System.out.println("L�tfen kullan�c� ad�n�z� giriniz: ");
			KullaniciAdi= inp.nextLine();
			System.out.println("L�tfen �ifrenizi giriniz:");
			Sifre= inp.nextLine();
			
			if( KullaniciAdi.equals("patika") && Sifre.equals("12345")) { 
				System.out.println("Giri� yapt�n�z");
				}
				
			else {
			
			System.out.println("Girdi�iniz bilgiler hatal�,�ifrenizi de�i�tirmek ister misiniz?\nEvet:1\nOturumu Kapat:2");
			
				cevap=inp.nextInt();
			
				  switch(cevap) {
				  
				  case 1:
					System.out.println("Yeni �ifrenizi giriniz: ");
				  
					String 	yenisifre= inp.nextLine();
					
					
					
					 if (yenisifre.equals("12345")) {
						
						System.out.println("�ifre de�i�tirilemedi");
					}
						else {
							System.out.println("�ifreniz de�i�tirilmi�tir");
							System.out.println("Yeni �ife= "+ yenisifre);
						}	
							
				  
				  
							
						break;
						
				  case 2:
					System.out.println("Oturum kapand�");
					
				
					break;
				  
				default :
					 System.out.println("Yanl�� se�im yapt�n�z")	;
					break;
				}
				
			}
		}
			
			

		
		
		
		
		
		
		
	}


