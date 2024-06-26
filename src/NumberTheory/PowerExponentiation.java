package NumberTheory;

/**
 * This class provides a method to compute the power of a number using the
 * exponentiation by squaring technique, which is efficient for both positive
 * and negative exponents.
 */
public class PowerExponentiation {

    /**
     * Computes the power of a number N raised to the specified exponent.
     *
     * @param N        the base number to be raised to a power
     * @param exponent the exponent to which the base number is to be raised.
     *                 Can be negative.
     * @return the result of N raised to the power of the exponent
     */
    public static double findPowerExponentiation(double N, int exponent) {
        boolean isPowerNegative = exponent < 0;
        double ans = 1;
        int absExponent = Math.abs(exponent); // Work with the absolute value of the exponent

        while (absExponent > 0) {
            if (absExponent % 2 != 0) {
                ans *= N; // Multiply ans by N when the current power is odd
            }
            N *= N; // Square the base
            absExponent /= 2; // Halve the exponent
        }

        return isPowerNegative ? 1.0 / ans : ans;
    }

    /**
     * The main method to test the findPowerExponentiation method with various inputs.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("3^-4 = " + findPowerExponentiation(3, -4)); // Test with a negative exponent
        System.out.println("2^10 = " + findPowerExponentiation(2, 10)); // Test with a positive exponent
        System.out.println("5^0 = " + findPowerExponentiation(5, 0));   // Test with zero exponent
    }
}
