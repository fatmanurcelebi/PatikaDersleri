import java.util.Scanner;
public class HW10 {

	public static void main(String[] args) {
		// S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
		//S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
		//S�cakl�k 15 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
		//S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.

		System.out.println("Hava s�cakl���n� giriniz: ");
		Scanner inp=new Scanner(System.in);
		int t= inp.nextInt();
		
		boolean kayak = t<5;
		boolean sinema= t<=15 && t>=5;
		boolean piknik= t>15 && t<25;
		boolean yuzme = t>=25 ;
		
		if(kayak) {
			
			System.out.println("Kaya�a gidebilirsiniz.");
			}
		if(sinema) {
			
			System.out.println("Sinemaya gidebilirsiniz.");
			}
		if(piknik) {
			
			System.out.println("Pikni�e gidebilirsiniz.");
			}
		if(yuzme) {
	
			System.out.println("Y�zmeye gidebilirsiniz.");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
