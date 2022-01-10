import java.util.Scanner;
public class dongu6 {

	public static void main(String[] args) {
		// Hormonik Seri
		
Scanner inp=new Scanner(System.in);

System.out.println("Bir sayý giriniz: ");
double n=inp.nextDouble();
double toplam=0;
for(double i=1;i<=n;i++) {
	
	 toplam+=1/i;
	
}
System.out.println("Harmonik toplam= "+toplam);		
		
	}

}
