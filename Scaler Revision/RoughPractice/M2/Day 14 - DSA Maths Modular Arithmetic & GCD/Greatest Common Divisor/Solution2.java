public class Solution2 {
    public static int gcd(int A, int B) {
        if (B==0) return A;
        return gcd(B,A%B);
    }
    public static void main(String[] args) {
    	int A = 48;
    	int B = 18;
    	System.out.println(gcd(A,B));
    }
}
