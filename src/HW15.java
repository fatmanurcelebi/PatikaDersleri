import java.util.Scanner;
public class HW15 {

	public static void main(String[] args) {
		// artık yıl hesaplama
		
		System.out.println("Yılı giriniz: ");
		
	Scanner inp=new Scanner(System.in);
	int yıl= inp.nextInt();
	
	if(yıl%4==0) {
		if(yıl%100==0) {
			if(yıl%400==0) {
				System.out.println(yıl+" 1bir artık yıldır.");
				
			}else {
				System.out.println(yıl+" 1artık yıl değildir.");
			}
			
		}else {
			System.out.println(yıl+" 2bir artık yıldır.");
		}
		
		
		
		
		
		
	}else {
		System.out.println(yıl+" 2artık yıl değildir.");
		
	}
		
		

	}

}
