public class Solution5 {
    public static int solve(int[][] A) {
        int len = A.length;
        int topleft =0;
        int buttomright =0;
        int tot =0;
        for (int a=0; a<len; a++) {
            for (int b=0; b<len; b++) {
                topleft = (a+1)*(b+1);
                buttomright = (len-a)*(len-b);
                tot+=A[a][b]*topleft*buttomright;
            }
        }
        return tot;
    }
    public static void main(String[] args) {
        // 40
        int[][] A = {{1,2},{3,4}};
        System.out.println(solve(A));
    }
}
