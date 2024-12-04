public class Trap {
    public int trap(final int[] A) {
        int len = A.length;
        if (A == null || len < 3) {
            return 0;
        }
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int waterTrapped = 0;
        leftMax[0] = A[0];
        for (int a = 1; a < len; a++) {
            leftMax[a] = Math.max(leftMax[a - 1], A[a]);
        }
        rightMax[len - 1] = A[len - 1];
        for (int b = len - 2; b >= 0; b--) {
            rightMax[b] = Math.max(rightMax[b + 1], A[b]);
        }
        for (int c = 0; c < len; c++) {
            waterTrapped += Math.min(leftMax[c], rightMax[c]) - A[c];
        }
        return waterTrapped;
    }
}
