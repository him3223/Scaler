public class Solution1 {
    public static int solve(int[][] A, int B) {
        int rlen = A.length;
        int clen = A[0].length;
        int r=0, c=clen-1;
        int ans = Integer.MAX_VALUE;
        while (r<rlen && c>-1) {
            if (A[r][c]==B) {
                ans = Math.min(ans,r+c);
                c--;
            }
            else if (A[r][c]<B) {
                r++;
            }
            else {
                c--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4,5},{2,4,6,8,10},{4,8,12,16,20}};
        int B=20;
        System.out.println(solve(A,B));
    }
}