import java.util.Arrays;
public class Solution4 {
    public static int[] solve(int[] A, int B) {
        // Copy the last `rot` elements to the beginning
        // Copy the first `len - rot` elements to the remaining part
        int len = A.length;
        int rot = B%len;
        int[] ans = new int[len];
        for (int a=0;a<rot ;a++ ) {
            ans[a]=A[len-rot+a];
        }
        for (int a=0; a<len-rot; a++) {
            ans[rot+a]=A[a];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
