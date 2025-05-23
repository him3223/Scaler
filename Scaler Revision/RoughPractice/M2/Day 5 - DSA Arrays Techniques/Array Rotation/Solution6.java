import java.util.Arrays;
public class Solution6 {
    public static int[] solve(int[] A, int B) {
        int len = A.length;
        int[] ans = new int[len];
        int rot = B%len;
        for (int a=0;a<rot ;a++ ) {
            ans[a]=A[len-rot+a];
        }
        for (int a=0;a<len-rot ;a++ ) {
            ans[rot+a]=A[a];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4,5,6,7};
        int B = 2;
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
