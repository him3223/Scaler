public class Solution3 {
    public static int solve(int A) {
        if (A<10) return A==1 ? 1:0;
        int sum = 0;
        while (A>0) {
            sum+=A%10;
            A/=10;
        }
        return solve(sum);
    }
    public static void main(String[] args) {
        int A = 83557;
        System.out.println(solve(A));
    }
}
