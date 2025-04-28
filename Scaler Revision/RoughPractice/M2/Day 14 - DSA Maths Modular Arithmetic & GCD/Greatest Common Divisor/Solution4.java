public class Solution4 {
    public static int gcd(int A, int B) {
        if (B==0) return A;
        return gcd(B,A%B);
    }
    public static void main(String[] args) {
    	int A = 4;
    	int B = 6;
    	System.out.println(gcd(A,B));
    }
}
