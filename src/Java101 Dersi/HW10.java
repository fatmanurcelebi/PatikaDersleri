import java.util.Scanner;
public class HW10 {

	public static void main(String[] args) {
		// Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner.
		//Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner.
		//Sýcaklýk 15 ve 25 arasýnda ise "Piknik" etkinliðini öner.
		//Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.

		System.out.println("Hava sýcaklýðýný giriniz: ");
		Scanner inp=new Scanner(System.in);
		int t= inp.nextInt();
		
		boolean kayak = t<5;
		boolean sinema= t<=15 && t>=5;
		boolean piknik= t>15 && t<25;
		boolean yuzme = t>=25 ;
		
		if(kayak) {
			
			System.out.println("Kayaða gidebilirsiniz.");
			}
		if(sinema) {
			
			System.out.println("Sinemaya gidebilirsiniz.");
			}
		if(piknik) {
			
			System.out.println("Pikniðe gidebilirsiniz.");
			}
		if(yuzme) {
	
			System.out.println("Yüzmeye gidebilirsiniz.");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
