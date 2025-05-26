import java.util.Arrays;
public class Solution {
    public static int[] solve(int[] A) {
        int len = A.length;
        int[] ans = new int[len];
        for (int a=0; a<len; a++) {
            ans[a]=countdiv(A[a]);
        }
        return ans;
    }
    static int countdiv(int num) {
        int count = 0;
        int sqrt = (int)Math.sqrt(num);
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
