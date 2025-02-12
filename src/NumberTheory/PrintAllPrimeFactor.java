package NumberTheory;

public class PrintAllPrimeFactor {

    /**
     * Prints all prime factors of the given number `n`.
     *
     * @param n The number for which to print all prime factors.
     */
    public static void printAllPrimeFactor(int n) {
        // Loop from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // Print the prime factor i
                System.out.print(i + " ");
                // Remove all occurrences of this prime factor from n
                while (n % i == 0) { n = n / i; }
            }
        }
        // If n is still greater than 1, it is a prime factor
        if (n != 1) {
            System.out.print(n + " ");
        }
    }

    /**
     * The main method which serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Print all prime factors of 37
        printAllPrimeFactor(37);
    }

    /**
     * Time Complexity: O(√n)
     *
     * The time complexity is O(√n) because the loop runs from 2 to √n.
     * In each iteration, we perform a constant amount of work.
     */
}