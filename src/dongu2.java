import java.util.Scanner;
public class dongu2 {

	public static void main(String[] args) {
		// girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program.
		
		
		Scanner inp=new Scanner(System.in);
		 
		System.out.println("�st s�n�r say�y� giriniz: ");
		int say�=inp.nextInt();
		
		
		for(int i=1;i<=say�;i*=4) {
			
		System.out.println(say�+"'den k���k, 4'�n kuvveti olan say�lar: "+i);
		}
		 
		
		for(int j=1;j<=say�;j*=5) {
			
		System.out.println(say�+"'den k���k, 5'in kuvveti olan say�lar: "+j);
		}
		
		
		
	}

}
