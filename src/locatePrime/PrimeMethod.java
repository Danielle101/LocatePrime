package locatePrime;

public class PrimeMethod {
	public static boolean isPrime(int number) {
		boolean result = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
			}
		}

		return result;
	}

}
