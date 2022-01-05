import java.util.Scanner;
public class dongu4 {

	public static void main(String[] args) {
		// üslü sayý hesaplama

		Scanner inp=new Scanner(System.in);
		System.out.println("a üssü b için; ");
		
		System.out.println("a deðerini giriniz: ");
		int a=inp.nextInt();
		System.out.println("b deðerini giriniz: ");
		int b=inp.nextInt();
		
		int deger=1;
		for(int i=1;i<=b;i++)
			deger*=a;
		
		
		
		System.out.println(a +" üssü " +b +" = "+deger);	
	}

}
