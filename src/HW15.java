import java.util.Scanner;
public class HW15 {

	public static void main(String[] args) {
		// art�k y�l hesaplama
		
		System.out.println("Y�l� giriniz: ");
		
	Scanner inp=new Scanner(System.in);
	int y�l= inp.nextInt();
	
	if(y�l%4==0) {
		if(y�l%100==0) {
			if(y�l%400==0) {
				System.out.println(y�l+" 1bir art�k y�ld�r.");
				
			}else {
				System.out.println(y�l+" 1art�k y�l de�ildir.");
			}
			
		}else {
			System.out.println(y�l+" 2bir art�k y�ld�r.");
		}
		
		
		
		
		
		
	}else {
		System.out.println(y�l+" 2art�k y�l de�ildir.");
		
	}
		
		

	}

}
