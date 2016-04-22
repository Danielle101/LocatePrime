package locatePrime;
import java.util.*;

public class LocatePrimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's located some primes!");
		System.out.println("This application will find you any prime, in order, from first prime number on.\n");
		System.out.println("Which prime number are you looking for?:");
		int x = scan.nextInt();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
			primes = PrimeMethod.allPrimes(x);
			
			for (int i = 0; i < primes.size(); i++) {
				System.out.print(primes.get(i) + " ");
			}
			scan.close();
	}

}
