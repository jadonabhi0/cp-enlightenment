package NumberTheory;

public class PrintAllDivisors {

    /**
     * Prints all divisors of the given number `n`.
     *
     * @param n The number for which to print all divisors.
     */
    public static void printAllDivisors(int n) {
        // Loop from 1 to the square root of n
        for (int i = 1; i * i <= n; i++) {
            // Check if i is a divisor of n
            if (n % i == 0) {
                // Print the divisor i
                System.out.print(i + " ");
                // Print the paired divisor n/i if it's different from i
                if (i != n / i) System.out.print(n / i + " ");
            }
        }
    }

    /**
     * The main method which serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Print all divisors of 36
        printAllDivisors(36);
        System.out.println();
        printAllDivisors(37);
    }
}