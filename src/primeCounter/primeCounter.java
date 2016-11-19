package primeCounter;

/*
 *  Count how many primes there are between 0 and number
 *  A prime number is a natural number greater than 1 that 
 *  has no positive divisors other than 1 and itself.
 */

public class primeCounter {

	public static void main(String[] args) {
		int count = 0;
		int number = (int) Math.pow(10, 6);
		double start = System.currentTimeMillis();

		for (int i = 0; i < number; i++) {
			if (isPrime(i)) {
				count++;
			}
		}

		double stop = System.currentTimeMillis() - start;

		System.out.println("Antal primtal mellan 0 och " + number + " är " + count);
		System.out.println("Det tog " + stop + " ms att kompilera");
	}

	/*
	 * Check if any number between 0 and the square root of n divides n. 
	 * If not, the the number n is a prime.
	 */
	public static boolean isPrime(int number) {
		// check if number is a multiple of 2 -> then it 
		//is divisible by 2 therefore not a prime
		if (number % 2 == 0) {
			return false;
		}
		//check all odd numbers i. If number is divisible with i, 
		//then it is not a prime
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
