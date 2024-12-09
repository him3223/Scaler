public class Solution2 {
    public static int numSetBits(int A) {
        int ans = 0;
        while (A!=0) {
            ans+=(A&1);
            A>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int A = 29;
        System.out.println(numSetBits(A));
    }
}
