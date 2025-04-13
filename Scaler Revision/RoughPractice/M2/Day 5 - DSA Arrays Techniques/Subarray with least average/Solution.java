public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int sum = 0;
        int minsum = 0;
        int minIndex = 0;
        for (int a=0; a<B; a++) {
            sum+=A[a];
        }
        minsum = sum;
        for (int a=B; a<len; a++) {
            sum+=A[a]-A[a-B];
            if (sum < minsum) {
                minsum = sum;
                minIndex = a-B+1;
            }
        }
        return minIndex;
    }
}
