public class Solution {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = M - 1;
        while (i < N && j >= 0) {
            if (A[i][j] == B) {
                int currentValue = (i + 1) * 1009 + (j + 1);
                result = Math.min(result, currentValue);
                j--;
            } else if (A[i][j] > B) {
                j--;
            } else {
                i++;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}