package NumberTheory;

public class IsPrime {


    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int x = 2; x * x <= n; x++) {
            if (x % n == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        isPrime(2);
    }
}
