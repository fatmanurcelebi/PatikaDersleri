import java.util.Scanner;
public class dongu4 {

	public static void main(String[] args) {
		// �sl� say� hesaplama

		Scanner inp=new Scanner(System.in);
		System.out.println("a �ss� b i�in; ");
		
		System.out.println("a de�erini giriniz: ");
		int a=inp.nextInt();
		System.out.println("b de�erini giriniz: ");
		int b=inp.nextInt();
		
		int deger=1;
		for(int i=1;i<=b;i++)
			deger*=a;
		
		
		
		System.out.println(a +" �ss� " +b +" = "+deger);	
	}

}
