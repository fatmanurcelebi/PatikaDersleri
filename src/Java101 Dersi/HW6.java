import java.util.Scanner;
public class HW6 {

	public static void main(String[] args) {
		// Armut : 2,14 TL, Elma : 3,67 TL, Domates : 1,11 TL,Muz: 0,95 TL,Patl�can : 5,00 TL

		
	Scanner inp= new Scanner(System.in);	
	double af=2.14 , ef=3.67, df=1.11, mf=0.95, pf=5.00 ;
	double a,e,d,m,p,ToplamFiyat ;
	System.out.println("Ka� kilo armut ald�n�z: ");
	a=inp.nextDouble();
	
	System.out.println("Ka� kilo elma ald�n�z: ");
	e=inp.nextDouble();
	
	System.out.println("Ka� kilo domates ald�n�z: ");
	d=inp.nextDouble();
	
	System.out.println("Ka� kilo muz ald�n�z: ");	
	m=inp.nextDouble();
	
	System.out.println("Ka� kilo patl�can ald�n�z: ");
	p=inp.nextDouble();
	
	ToplamFiyat=a*af+e*ef+d*df+m*mf+p*pf ;
		
		
    System.out.println( "Toplam Fiyat= "+ToplamFiyat+"TL");
		
		
		
	}

}
