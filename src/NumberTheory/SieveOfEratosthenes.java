package NumberTheory;

import java.util.Arrays;

/**
 * This class provides a method to find all prime numbers up to a given limit
 * using the Sieve of Eratosthenes algorithm.
 */
public class SieveOfEratosthenes {

    /**
     * Finds and prints all prime numbers up to a specified limit using the Sieve of Eratosthenes algorithm.
     *
     * @param n the upper bound (inclusive) for finding prime numbers
     */
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially

        // Implement the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        // Output the prime numbers
        System.out.println("Prime numbers between 2 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline at the end
    }

    /**
     * The main method to test the sieveOfEratosthenes method with a specific limit.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        sieveOfEratosthenes(3000); // Test the sieve method with the limit of 3000
    }
}
