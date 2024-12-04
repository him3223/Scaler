import java.util.Arrays;
public class Solution1 {
    public static int subarraySum(int[] A) {
        int countribution = 0;
        int len = A.length;
        for (int a=0; a<len; a++) {
            countribution += A[a]*(a+1)*(len-a);
        }
        return countribution;
    }
    public static void main(String[] args) {
        int[] A = {2,4,6};
        System.out.println(subarraySum(A));
    }
}