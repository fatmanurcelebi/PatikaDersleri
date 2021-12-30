import java.util.Scanner ;
public class HW3 {

	public static void main(String[] args) {
		//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
       //𝑢 = (a+b+c) / 2

      //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

      Scanner input= new Scanner (System.in) ; 		
		
	double a,b,c,cevre,u,alan;
	
	System.out.println("Üçgenin 1.kenar uzunluğunu girin:");
	a= input.nextDouble();
	System.out.println("Üçgenin 2.kenar uzunluğunu girin:");
	b= input.nextDouble();
	System.out.println("Üçgenin 3.kenar uzunluğunu girin:");
	c= input.nextDouble();	
	
	cevre= a+b+c;
	u=cevre/2;
	alan= Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
	 System.out.println("Üçgenin Alanı: "+alan);
	 
		
		
		
		
		
		
	}

}
