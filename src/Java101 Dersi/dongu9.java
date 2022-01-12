import java.util.Scanner;
public class dongu9 {

	public static void main(String[] args) {
		//Ebob-Ekok bulma
		
	Scanner inp= new Scanner(System.in)	;
	int n1,n2 ;
	int ebob=1;
	int ekok=1;
	int i=1;
	int k=1;
	System.out.println("First number:  ");
	n1=inp.nextInt();
	
	System.out.println("Second number:  ");	
	n2=inp.nextInt();	
		
	while(i<=n1 && i<=n2) {// bu sekilde hangi sayinin daha buyuk oldugu onemli degil
		
		if(n1 % i==0 && n2 % i==0){
			
			ebob=i; 
			}
		i++;
		}
	
	System.out.println("EBOB= "+ebob);
		
	k= n1*n2;	
	while (k>=n1 && k>=n2) {// bu sekilde hangi sayinin daha buyuk oldugu onemli degil
		
		if(k%n1==0 && k%n2==0) {
			
			ekok=k;
		
		}
		k--;
		}
		
	System.out.println("EKOK= "+ekok);
		
		
	
		
		
		inp.close();
	
	}

}
