import java.util.Scanner;
public class HW11 {

	public static void main(String[] args) {
		// Girilen 3 say�y� "k���kten b�y��e" s�ralayan program� yaz�n�z.

		Scanner inp= new Scanner(System.in);
		int a,b,c;
		
		System.out.println("1.say�: ");
		a=inp.nextInt();
		System.out.println("2.say�: ");
		b=inp.nextInt();
		System.out.println("3.say�: ");
		c=inp.nextInt();
	
		if(a<b && a<c) {
			if(b<c) {
				
				System.out.println("a<b<c");
				}
			else {
			System.out.println("a<c<b");
		}
		}
		else if(b<a && b<c) {
			if(a<c) {
				System.out.println("b<a<c");
			}
				else {
					
					System.out.println("b<c<a");
				}
			
				}
		else if (c<a && c<b) {
			if(a<b) {
				System.out.println("c<a<b");
			}
			else {
				System.out.println("c<b<a");
			}
		}

}
}