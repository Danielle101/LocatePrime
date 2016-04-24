//package locatePrime;
//
//import java.util.ArrayList;
//
//public class PrimeMethod {
//	
//	public static boolean isPrime(int number) {
//		for (int i = 2; i < Math.sqrt(number); i++) {
//			if (number % i == 0) {
//				return false;
//			}
//		}
//
//		return true;
//	}
//	
//	public static ArrayList<Integer> allPrimes(int max) {
//		ArrayList<Integer> primes = new ArrayList<Integer>();
//		for (int i = 2; i <= max; i++) {
//			if (isPrime(i)) {
//				primes.add(i);
//			}
//		}
//		return primes;
//	}
//	
//	public static int getPrime(int index) {
//		return allPrimes(index*index).get(index-1);
//	}
//
//}
