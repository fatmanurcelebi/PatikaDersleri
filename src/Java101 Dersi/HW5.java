import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// V�cut Kitle �ndeksi = Kilo (kg) / Boy(m) * Boy(m)

		
		Scanner inp= new Scanner(System.in) ;
		
		
		Double kilo,boy,VKI ;
		
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz :");
		boy= inp.nextDouble();
		
		System.out.println("L�tfen kilonuzu giriniz(kg) :");
		kilo=inp.nextDouble();
		
		VKI= kilo/(boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz :"+VKI);
		
		
		
		
		
		
		
	}

}
