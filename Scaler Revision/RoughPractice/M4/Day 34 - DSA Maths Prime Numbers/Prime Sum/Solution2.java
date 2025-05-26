import java.util.Arrays;
public class Solution2 {
    public static int[] primesum(int A) {
        for (int a=2; a <= A/2; a++) {
            if (isPrime(a) && isPrime(A-a))
                return new int[] {a,A-a}; 
        }
        return new int[0];
    }
    public static boolean isPrime(int num) {
        if (num<2) return false;
        for (int a=2; a*a<=num; a++) {
            if (num%a==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int A = 26;
        System.out.println(Arrays.toString(primesum(26)));
    }
}
