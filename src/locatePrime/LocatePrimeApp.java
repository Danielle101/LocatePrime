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

		System.out.println(getPrime(x));
		scan.close();

	}
	public static boolean isPrime(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	public static ArrayList<Integer> allPrimes(int max) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= max; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static int getPrime(int index) {
		return allPrimes(index*index).get(index-1);
	}
}
