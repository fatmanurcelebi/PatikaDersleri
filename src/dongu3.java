import java.util.Scanner;
public class dongu3 {

	public static void main(String[] args) {
		//Kombinasyon form�l�=   C(n,r) = n! / (r! * (n-r)!)

		Scanner inp=new Scanner(System.in);
		System.out.println("N'in r'li kombinasyonu i�in; ");
		
		System.out.println("N de�erini giriniz: ");
		int N=inp.nextInt();
		
		System.out.println("r de�erini giriniz: ");
		int r=inp.nextInt();
		
		int facN=1 ;
		int facr=1;
		int facNr=1;
		
		for(int i=1; i<=N;i++) {
			facN*=i;
		}
		for(int j=1; j<=r;j++) {
			facr*=j;
		}
		for(int k=1; k<=N-r;k++) {
			facNr*=k;
		}
		
		int comb= facN/(facr*facNr);
		
		System.out.println(N+"'in "+r+"'li kombinasyonu= "+comb);
		
		
		
		
		
		
	}

}
