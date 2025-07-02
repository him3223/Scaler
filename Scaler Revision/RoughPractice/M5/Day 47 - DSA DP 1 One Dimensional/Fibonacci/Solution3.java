import java.util.HashMap;

public class Solution3 {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);
        int result = fib(n-1)+fib(n-2);
        memo.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series (Memoization): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
