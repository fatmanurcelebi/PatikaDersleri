import java.util.Scanner;
public class HW7 {

	public static void main(String[] args) {
		// Hesap Makinas�
int n1,n2;
Scanner input = new Scanner(System.in);
System.out.println("Birinci say�y� giriniz: ");
n1=input.nextInt();
System.out.println("�kinci say�y� giriniz: ");
n2=input.nextInt();
System.out.println("Yapmak istedi�iniz i�lem se�iniz: ");		
System.out.println("Toplama i�in:1\n��karma i�in:2\n�arpma i�in:3\nB�lme i�in:4 ");		
int secim;
secim=input.nextInt();		

switch(secim){
		
case 1:

	System.out.println("��lemin Sonucu= "+n1+n2 );	
	
	break;
	
case 2:
	System.out.println("��lemin Sonucu= "+(n1-n2) );
	
	break;
	
case 3:
System.out.println("��lemin Sonucu= "+n1*n2 );	
	
	break;
	
	
case 4:

	switch (n2) {
		case 0:
	System.out.println("Bir say� s�f�ra b�l�nemez.");	
		break;
	default:
		System.out.println("��lemin Sonucu= "+n1/n2 );		
		break;
	}
	break;
	
default:
	System.out.println("Yanl�� Se�im Yapt�n�z.");
	}

	}
}
