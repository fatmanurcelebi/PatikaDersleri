import java.util.Scanner;
public class HW7 {

	public static void main(String[] args) {
		// Hesap Makinasý
int n1,n2;
Scanner input = new Scanner(System.in);
System.out.println("Birinci sayýyý giriniz: ");
n1=input.nextInt();
System.out.println("Ýkinci sayýyý giriniz: ");
n2=input.nextInt();
System.out.println("Yapmak istediðiniz iþlem seçiniz: ");		
System.out.println("Toplama için:1\nÇýkarma için:2\nÇarpma için:3\nBölme için:4 ");		
int secim;
secim=input.nextInt();		

switch(secim){
		
case 1:

	System.out.println("Ýþlemin Sonucu= "+n1+n2 );	
	
	break;
	
case 2:
	System.out.println("Ýþlemin Sonucu= "+(n1-n2) );
	
	break;
	
case 3:
System.out.println("Ýþlemin Sonucu= "+n1*n2 );	
	
	break;
	
	
case 4:

	switch (n2) {
		case 0:
	System.out.println("Bir sayý sýfýra bölünemez.");	
		break;
	default:
		System.out.println("Ýþlemin Sonucu= "+n1/n2 );		
		break;
	}
	break;
	
default:
	System.out.println("Yanlýþ Seçim Yaptýnýz.");
	}

	}
}
