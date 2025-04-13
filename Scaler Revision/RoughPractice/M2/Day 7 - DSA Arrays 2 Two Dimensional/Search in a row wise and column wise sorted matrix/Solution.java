public class Solution {
    public static int solve(int[][] A, int B) {
        int rowlen = A.length;
        int colen = A[0].length;
        int result = Integer.MAX_VALUE;
        int a=0;
        int b=colen-1;
        // int cur = 0;
        while (a<rowlen && b>=0) {
            if (A[a][b]==B) {
                result = Math.min(result,((a+1)*1009+(b+1)));
                b--;
            }
            else if (A[a][b]>B) {
                b--;
            }
            else {
                a++;
            }
        }
        return result == Integer.MAX_VALUE ? -1:result;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int B = 2;
        System.out.println(solve(A,B));
    }
}