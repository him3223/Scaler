public class Solution {
    public static int trap(final int[] A) {
        int len = A.length;
        if (A==null || len<3) return 0;
        int watertrapped = 0;
        int[] leftmax = new int[len];
        int[] rightmax = new int[len];
        leftmax[0]=A[0];
        rightmax[len-1]=A[len-1];
        for (int a=1; a<len; a++) {
            leftmax[a]=Math.max(leftmax[a-1],A[a]);
        }
        for (int a=len-2; a>-1; a--) {
            rightmax[a]=Math.max(rightmax[a+1],A[a]);
        }
        for (int a=0; a<len; a++) {
            watertrapped+=Math.min(leftmax[a],rightmax[a])-A[a];
        }
        return watertrapped;
    }
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2};
        System.out.println(trap(A));
    }
}
