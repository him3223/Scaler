public class Solution3 {
    public static int numSetBits(int A) {
        int countBit =0;
        while(A!=0) {
            countBit+=(A&1);
            A>>=1;
        }
        return countBit;
    }
    public static void main(String[] args) {
        int A = 29;
        System.out.println(numSetBits(A));
    }
}
