import java.util.Scanner;
public class dongu2 {

	public static void main(String[] args) {
		// girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran program.
		
		
		Scanner inp=new Scanner(System.in);
		 
		System.out.println("Üst sýnýr sayýyý giriniz: ");
		int sayý=inp.nextInt();
		
		
		for(int i=1;i<=sayý;i*=4) {
			
		System.out.println(sayý+"'den küçük, 4'ün kuvveti olan sayýlar: "+i);
		}
		 
		
		for(int j=1;j<=sayý;j*=5) {
			
		System.out.println(sayý+"'den küçük, 5'in kuvveti olan sayýlar: "+j);
		}
		
		
		
	}

}
