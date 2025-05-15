public class Solution {
    public static int solve(int[] A) {
        int maxsofar = 0;
        int chunks = 0;
        for (int a=0; a<A.length; a++) {
            maxsofar = Math.max(maxsofar,A[a]);
            if (maxsofar==a) {
                chunks++;
            }
        }
        return chunks;
    }
    public static void main(String[] args) {
        int[] A = {2, 0, 1, 3};
        System.out.println(solve(A));
    }
}
