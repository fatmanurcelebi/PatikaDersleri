import java.util.Scanner;
public class dongu8 {

	public static void main(String[] args) {
		// Atm �rne�i
		
		Scanner inp=new Scanner(System.in);
		String givenKullanici="patika";
		String givenSifre="12345";
		int secim;
		int right=3;
		int balance=2000;
		
		
while(right>0) {
	System.out.println("Kullan�c� ad�n� giriniz: ");
	String isim=inp.nextLine();
	System.out.println("�ifrenizi giriniz: ");
	String sifre=inp.nextLine();
	
	if(isim.equals(givenKullanici)&& sifre.equals(givenSifre)) {
		
		
				
	do {
			System.out.println("1-Para �ekme \n 2-Para yat�rma \n 3-Bakiye sorgulama \n 4-��k�� Yapma");
			System.out.println("Ho�geldiniz.L�tfen yapmak istedi�iniz i�lemi se�iniz.");
			
		 secim=inp.nextInt();
		  switch(secim) {
				
			case 1 :System.out.println("�ekmek istedi�iniz miktar� giriniz: ");
				int cekim=inp.nextInt();
				if(cekim<=balance) {
				
				balance-=cekim;
				System.out.println("Kalan bakiyeniz: "+ balance);}
				else {
					
					System.out.println("Bakiye yetersiz.");
				}
				break;	
			case 2:System.out.println("Yat�rmak istedi�iniz miktar� giriniz: ");
				int yatirma=inp.nextInt();
				balance+=yatirma;
				System.out.println("Kalan bakiyeniz: "+ balance);
					
				
				break;
			case 3:
					System.out.println("Bakiyeniz: "+ balance);
			break;		
		  }}while(secim!=4) ;
		System.out.println("��k�� yap�ld�.Te�ekk�rler.");
		break;
		
		  		}
							
	else {
				
		right--;
				
		if(right==0) {
			System.out.println("Kart�n�z bloke edildi.L�tfen bankay� aray�n.");
							}	
		else {
			System.out.println("Bilgileri yanl�� girdiniz.L�tfen tekrar deneyin");
			System.out.println("Kalan hakk�n�z: "+right);
		}}
	
				
		
				
		
}}	}	
			
			
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


