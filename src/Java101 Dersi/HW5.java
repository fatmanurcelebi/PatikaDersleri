import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// Vücut Kitle Ýndeksi = Kilo (kg) / Boy(m) * Boy(m)

		
		Scanner inp= new Scanner(System.in) ;
		
		
		Double kilo,boy,VKI ;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
		boy= inp.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz(kg) :");
		kilo=inp.nextDouble();
		
		VKI= kilo/(boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz :"+VKI);
		
		
		
		
		
		
		
	}

}
