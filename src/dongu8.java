import java.util.Scanner;
public class dongu8 {

	public static void main(String[] args) {
		// Atm örneði
		
		Scanner inp=new Scanner(System.in);
		String givenKullanici="patika";
		String givenSifre="12345";
		int secim;
		int right=3;
		int balance=2000;
		
		
while(right>0) {
	System.out.println("Kullanýcý adýný giriniz: ");
	String isim=inp.nextLine();
	System.out.println("Þifrenizi giriniz: ");
	String sifre=inp.nextLine();
	
	if(isim.equals(givenKullanici)&& sifre.equals(givenSifre)) {
		
		
				
	do {
			System.out.println("1-Para çekme \n 2-Para yatýrma \n 3-Bakiye sorgulama \n 4-Çýkýþ Yapma");
			System.out.println("Hoþgeldiniz.Lütfen yapmak istediðiniz iþlemi seçiniz.");
			
		 secim=inp.nextInt();
		  switch(secim) {
				
			case 1 :System.out.println("Çekmek istediðiniz miktarý giriniz: ");
				int cekim=inp.nextInt();
				if(cekim<=balance) {
				
				balance-=cekim;
				System.out.println("Kalan bakiyeniz: "+ balance);}
				else {
					
					System.out.println("Bakiye yetersiz.");
				}
				break;	
			case 2:System.out.println("Yatýrmak istediðiniz miktarý giriniz: ");
				int yatirma=inp.nextInt();
				balance+=yatirma;
				System.out.println("Kalan bakiyeniz: "+ balance);
					
				
				break;
			case 3:
					System.out.println("Bakiyeniz: "+ balance);
			break;		
		  }}while(secim!=4) ;
		System.out.println("Çýkýþ yapýldý.Teþekkürler.");
		break;
		
		  		}
							
	else {
				
		right--;
				
		if(right==0) {
			System.out.println("Kartýnýz bloke edildi.Lütfen bankayý arayýn.");
							}	
		else {
			System.out.println("Bilgileri yanlýþ girdiniz.Lütfen tekrar deneyin");
			System.out.println("Kalan hakkýnýz: "+right);
		}}
	
				
		
				
		
}}	}	
			
			
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


