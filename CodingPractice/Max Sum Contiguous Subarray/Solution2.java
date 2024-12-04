import java.util.Arrays;
public class Solution2 {
    public static int maxSubArray(final int[] A) {
    	int len = A.length;
    	int max = Integer.MIN_VALUE;
    	int runsum = 0;
    	for (int a=0; a<len; a++) {
    		runsum+=A[a];
    		max = Math.max(max,runsum);
    		if (runsum < 0)
    			runsum = 0;
    	}
    	return max;

    }
	public static void main(String[] args) {
		int[]  A = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(A));
	}
}