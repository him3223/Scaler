import java.util.Arrays;
public class Solution {
    public static int[] primesum(int A) {
        for (int i = 2; i <= A / 2; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                return new int[]{i, A - i};
            }
        }
        return new int[0]; // Shouldn't happen for valid even A > 2
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int A = 26;
        System.out.println(Arrays.toString(primesum(26)));
    }
}
