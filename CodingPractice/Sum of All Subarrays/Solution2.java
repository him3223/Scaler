import java.util.Arrays;
public class Solution2 {
    public static int subarraySum(int[] A) {
        int contribution = 0;
        int len = A.length;
        for (int a=0; a<len; a++) {
            contribution += A[a]*(len-1)*(a+1);
        }
        return contribution;
    }
    public static void main(String[] args) {
        int[] A = {2,4,6};
        System.out.println(subarraySum(A));
    }
}