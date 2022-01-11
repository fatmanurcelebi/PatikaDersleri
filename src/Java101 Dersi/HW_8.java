import java.util.Scanner;

public class HW_8 {

	public static void main(String[] args) {
		// // Þifre deðiþtirme
		
		 Scanner inp = new Scanner(System.in) ;
			String KullaniciAdi,Sifre;
			int cevap;
			System.out.println("Lütfen kullanýcý adýnýzý giriniz: ");
			KullaniciAdi= inp.nextLine();
			System.out.println("Lütfen þifrenizi giriniz:");
			Sifre= inp.nextLine();
			
			if( KullaniciAdi.equals("patika") && Sifre.equals("12345")) { 
				System.out.println("Giriþ yaptýnýz");
				}
				
			else {
			
			System.out.println("Girdiðiniz bilgiler hatalý,þifrenizi deðiþtirmek ister misiniz?\nEvet:1\nOturumu Kapat:2");
			
				cevap=inp.nextInt();
			
				  switch(cevap) {
				  
				  case 1:
					System.out.println("Yeni þifrenizi giriniz: ");
				  
					String 	yenisifre= inp.nextLine();
					
					
					
					 if (yenisifre.equals("12345")) {
						
						System.out.println("Þifre deðiþtirilemedi");
					}
						else {
							System.out.println("Þifreniz deðiþtirilmiþtir");
							System.out.println("Yeni þife= "+ yenisifre);
						}	
							
				  
				  
							
						break;
						
				  case 2:
					System.out.println("Oturum kapandý");
					
				
					break;
				  
				default :
					 System.out.println("Yanlýþ seçim yaptýnýz")	;
					break;
				}
				
			}
		}
			
			

		
		
		
		
		
		
		
	}


