import java.util.Scanner;
public class dongu10 {

	public static void main(String[] args) {
		// N sayidan en kucugunu ve buyugunu bulma
	Scanner inp=new Scanner(System.in);

	System.out.println("Kaç tane sayi gireceksiniz: ");
	int N= inp.nextInt();
	System.out.println("1.sayýyý giriniz: ");
    int	n=inp.nextInt();
	int max=n;
	int min=n;
    int k;
    
	for(int i=1;i<N;i++) {
		
	System.out.println((i+1)+". sayiyi giriniz: ");
    k=inp.nextInt();
	     if(k<min) {
	    	 min=k;
	
	}
	   if(k>max) {
		   max=k;
		   
	   }
}
	
System.out.println("En kucuk sayi: "+min);
System.out.println("En buyuk sayi: "+max);
	
	
		
		
		
		
		
inp.close();
	}

}
