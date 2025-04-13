public class Solution5 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maxSubArray(final int[] A) {
        int len = A.length;
        int runsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int a=0; a<len; a++) {
            runsum+=A[a];
            if (runsum<0) {
                runsum = 0;
            }
            maxsum=Math.max(runsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(A));
    }
}
