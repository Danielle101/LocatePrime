package locatePrime;

public class PrimeMethod {
	public static boolean isPrime(int number){
		 
		    if(number < 10) {
		    	if (number == 2 || number==3 || number==5 || number==7) {
		    		return true; }
		    	else {
		    		return false;
		    	}
		    }else if(number % 3 == 0 && number %5==0  && number %2==0){
		    	return false;
		    }
		    
		      
		    
		  
		  return true;
		}

}
