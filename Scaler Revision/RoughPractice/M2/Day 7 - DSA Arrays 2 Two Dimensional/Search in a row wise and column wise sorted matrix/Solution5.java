public class Solution5 {
    public static int solve(int[][] A, int B) {
        int rowlen = A.length;
        int colen = A[0].length;
        int r = 0;
        int c = colen-1;
        int result = Integer.MAX_VALUE;
        while (r<rowlen && c>=0) {
            if (A[r][c]==B) {
                result = Math.min(result,(r+1)*1009+(c+1));
                c--;
            }
            else if (A[r][c] > B) c--;
            else r++;
        }
        return result == Integer.MAX_VALUE ? -1:result;
    }
    public static void main(String[] args) {
        // (i * 1009 + j)
        // 1011
        int[][] A = {{1,2},{3,3}};
        int B = 3;
        System.out.println(solve(A,B));
    }
}