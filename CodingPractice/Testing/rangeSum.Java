import java.util.Arrays;
public class rangeSum {
    public long[] range(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }
        long[] result = new long[m];
        for (int i = 0; i < m; i++) {
            int L = B[i][0];
            int R = B[i][1];
            result[i] = prefix[R + 1] - prefix[L];
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        int[] A = {1,2,3,4,5};
        int len = A.length;
        int prefix[] = new int[len+1];
        // prefix[0]=A[0];
        for (int a=0; a<len; a++) {
            prefix[a+1] = prefix[a] + A[a];
        }
        System.out.println(Arrays.toString(prefix));
        */
        int[] A = {1,2,3,4,5};
        int n = A.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}