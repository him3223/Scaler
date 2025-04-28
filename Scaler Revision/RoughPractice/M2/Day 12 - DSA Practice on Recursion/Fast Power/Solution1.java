public class Solution1 {
    public static int power(int A, int B) {
        if (B==0) return 1;
        int p = power(A,B/2);
        if (B%2==0) return p*p;
        return p*p*A;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
