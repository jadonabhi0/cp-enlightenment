package NumberTheory;

/**
 * This class provides methods to compute the Greatest Common Divisor (GCD) or Highest Common Factor (HCF)
 * of two integers using different algorithms.
 */
public class GCD_HCF {

    /**
     * Computes the GCD of two integers using a naive approach by checking all numbers from 1 to the minimum of the two numbers.
     * Prints the GCD.
     *
     * @param a the first integer
     * @param b the second integer
     *
     * Time Complexity: O(min(a, b))
     */
    public static void gcdNaive(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;  // Start with the lowest possible GCD which is 1
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD (Naive): " + gcd);
    }

    /**
     * Computes the GCD of two integers using a slightly optimized approach by checking from the minimum number down to 1.
     * Prints the GCD.
     *
     * @param a the first integer
     * @param b the second integer
     *
     * Time Complexity: O(min(a, b))
     */
    public static void gcdOptimized(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD (Optimized): " + i);
                return;
            }
        }
    }

    /**
     * Computes the GCD of two integers using the Euclidean algorithm.
     * Prints the GCD.
     *
     * @param a the first integer
     * @param b the second integer
     *
     * Time Complexity: O(log(min(a, b)))
     */
    public static void gcdEuclidean(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD (Euclidean): " + a);
    }

    /**
     * Main method to test the GCD computation methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 40;

        gcdNaive(a, b);
        gcdOptimized(a, b);
        gcdEuclidean(a, b);
    }
}
