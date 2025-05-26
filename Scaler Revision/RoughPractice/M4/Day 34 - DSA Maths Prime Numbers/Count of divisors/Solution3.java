import java.util.Arrays;
public class Solution3 {
    static int count;
    static int sqrt;
    public static int[] solve(int[] A) {
        int len = A.length;
        for (int a=0; a<len; a++) {
            A[a]=fact(A[a]);
        }
        return A;
    }
    static int fact(int num) {
        sqrt = (int)Math.sqrt(num);
        count = 0;
        for (int a=1; a<=sqrt; a++) {
            if (num%a==0) {
                if (a==num/a) count++;
                else count+=2;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
