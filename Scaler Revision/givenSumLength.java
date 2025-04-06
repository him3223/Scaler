public class Solution {
    public int solve(int[] A, int B, int C) {
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        for (int i = B - 1; i < n; i++) {
            int sum = prefixSum[i] - (i - B >= 0 ? prefixSum[i - B] : 0);
            if (sum == C) {
                return 1;
            }
        }
        return 0;
    }
}