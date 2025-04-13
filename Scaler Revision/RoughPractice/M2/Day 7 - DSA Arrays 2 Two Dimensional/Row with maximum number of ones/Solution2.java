public class Solution2 {
    public static int solve(int[][] A) {
        int len = A.length;
        int row = 0;
        int col = len-1;
        int maxrowindex = 0;
        while (row < len && col >-1) {
            if (A[row][col]==1) {
                maxrowindex=row;
                col--;
            }
            else row++;
        }
        return maxrowindex;
    }
    public static void main(String[] args) {
        // 3
         int[][] A = {{0, 0, 0, 0},
         {0, 0, 0, 1},
         {0, 0, 1, 1},
         {0, 1, 1, 1}};
        System.out.println(solve(A));
    }
}
