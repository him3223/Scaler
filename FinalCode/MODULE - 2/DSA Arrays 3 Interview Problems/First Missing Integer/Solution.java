public class Solution {
    public int firstMissingPositive(int[] A) {
        int len = A.length;
        boolean check[] = new boolean[len];
        for (int a=0; a<len; a++) {
            if ((A[a]>0) && (A[a]<=len)) {
                check[A[a]-1]=true;
            }
        }
        for (int b=0; b<len; b++) {
            if (check[b]==false) {
                return b+1;
            }
        }
        return len+1;
    }
}
