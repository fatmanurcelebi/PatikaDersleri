
public class dongu15 {

	static boolean isPolindrom(int number) {
		int tempNumber= number;
		int reverseNumber=0 ;
	    int lastDigit=0  ;
		
	    while(tempNumber!=0) {
			lastDigit=tempNumber%10;
			tempNumber/=10;
			reverseNumber=(reverseNumber*10)+lastDigit;
			
		}
		
		if (reverseNumber==number) {
			
		
		
			return true;	}
		else {
		return false;
	
	}}
	
	
	public static void main(String[] args) {
		// Palindrom Numbers
		
		
		System.out.println(isPolindrom(1221));
		 

	
		
		
		
		
		
		

	}

}
