import java.util.Arrays;
public class Solution7 {
    public static int[] solve(int[] A, int B) {
        int len = A.length;
        int rot = B%len;
        int[] ans = new int[len];
        for (int a=0;a<rot ;a++ ) {
            ans[a]=A[len-rot+a];
        }
        for (int a=0;a<len-rot ;a++ ) {
            ans[rot+a]=A[a];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2,5,6};
        int B = 1;
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
