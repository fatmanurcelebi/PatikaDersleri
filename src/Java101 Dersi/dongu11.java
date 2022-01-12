import java.util.Scanner;
public class dongu11 {

	public static void main(String[] args) {
		// Mukemmel sayi
		
		Scanner inp=new Scanner(System.in);

		System.out.println("Bir sayi giriniz: ");
		int n= inp.nextInt();
		int toplam=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				toplam+=i;
				
				}
				
		}if(toplam==n) {
			
			System.out.println(n+" bir mukemmel sayidir.");
		}else {
			System.out.println(n+" mukemmel sayi degildir.");
			
		}
		
		

	}

}
