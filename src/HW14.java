import java.util.Scanner;
public class HW14 {

	public static void main(String[] args) {
		// �in Zodya�� Hesaplama
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Do�um y�l�n�z� giriniz: ");
        int y�l=inp.nextInt();

        int kalan= y�l%12; 
        switch(kalan) {
        
        case 0:
        	System.out.println("�in Zodya�� Burcunuz: Maymun  ");
        break;
        case 1:
        	System.out.println("�in Zodya�� Burcunuz: Horoz  ");
            break;
        case 2:
        	System.out.println("�in Zodya�� Burcunuz: K�pek ");
            break;
        case 3:
        	System.out.println("�in Zodya�� Burcunuz: Domuz ");
            break;
        case 4:
        	System.out.println("�in Zodya�� Burcunuz: Fare ");
            break;
        case 5:	
        	System.out.println("�in Zodya�� Burcunuz: �k�z ");
            break;
        case 6:
        	System.out.println("�in Zodya�� Burcunuz: Kaplan ");
            break;
        case 7:
        	System.out.println("�in Zodya�� Burcunuz: Tav�an ");
            break;
        case 8:
        	System.out.println("�in Zodya�� Burcunuz: Ejderha ");
            break;
        case 9:
        	System.out.println("�in Zodya�� Burcunuz: Y�lan ");
            break;
        case 10:
        	System.out.println("�in Zodya�� Burcunuz: At ");
            break;
        case 11:
        	System.out.println("�in Zodya�� Burcunuz: Koyun ");
            break;
        	
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
