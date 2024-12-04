public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
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
}
