import java.util.HashMap;

public class Solution2 {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int result = 0;
    public static int fib(int n) {
        if (n<=1)
            return 1;
        if (memo.containsKey(n))
            return memo.get(n);
        result = fib(n-1)+fib(n-2);
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
