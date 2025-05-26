import java.util.Arrays;
public class Solution2 {
    public static int[][] solve(int A) {
        int[][] ans = new int[A][A];
        for (int r=0; r<A; r++) {
            for (int c=0; c<=r; c++) {
                if ((c==0) || (r==c))
                    ans[r][c]=1;
                else
                    ans[r][c]=ans[r-1][c]+ans[r-1][c-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solve(5)));
    }
}
