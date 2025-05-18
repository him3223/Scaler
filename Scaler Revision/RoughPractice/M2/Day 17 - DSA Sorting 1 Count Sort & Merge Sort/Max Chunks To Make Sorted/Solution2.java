public class Solution2 {
    public static int solve(int[] A) {
        int len = A.length;
        int chunks = 0;
        int max = 0;
        for (int a=0; a<len; a++) {
            max=Math.max(max,A[a]);
            if (max==a) {
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
