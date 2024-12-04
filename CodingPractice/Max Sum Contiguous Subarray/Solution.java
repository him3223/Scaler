public class Solution {
    public int maxSubArray(final int[] A) {
        int len = A.length;
        int runsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int a=0; a<len; a++) {
            runsum+=A[a];
            maxsum = Math.max(runsum,maxsum);
            if (runsum < 0) {
                runsum = 0;
            }
        }
        return maxsum;
    }
}
