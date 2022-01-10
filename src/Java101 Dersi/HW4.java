import java.util.Scanner ;

public class HW4 {

	public static void main (String[]args) {
//Yarıçapı r, merkez açısının ölçüsü x olan daire diliminin alanı bulan programı yazınız.

// Formül : (𝜋 * (r*r) * x) / 360
		

	Scanner inp = new Scanner(System.in)	;
		
	double r,x;
	double pi=3.14;
	 
	System.out.println("Yarıçapı giriniz(cm):");
	r=inp.nextDouble() ;
	
	System.out.println("Merkez açısını giriniz(derece):");
	x=inp.nextDouble();
	Double Alan= (pi*r*r*x)/360;
	
	System.out.println("Daire diliminin alanı "+ Alan+" santimetrekaredir" );
		
		
		
		
		
		
		
	}

}
