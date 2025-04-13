public class Solution4 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maxSubArray(final int[] A) {
        int len = A.length;
        int maxsum = Integer.MIN_VALUE;
        int runsum = 0;
        for (int a=0; a<len; a++) {
            runsum+=A[a];
            if (runsum<0) {
                runsum=0;
            }
            maxsum=Math.max(runsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] A = {9,-19,10,5,1};
        System.out.println(maxSubArray(A));
    }
}
