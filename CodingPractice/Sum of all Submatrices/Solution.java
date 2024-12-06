public class Solution {
    public static void main(String[] args) {
        // Input matrix
        int[][] A = {
            {3, 2, 6},
            {4, 5, 9},
            {8, 7, 2}
        };
        System.out.println("Sum of all submatrices: " + calculateSubmatrixSum(A));
    }
    
    public static int calculateSubmatrixSum(int[][] A) {
        int len = A.length;
        int ans=0;
        for (int a=0;a<len ;a++ ) {
            for (int b=0;b<len ;b++ ) {
                ans+=(A[a][b]*(a+1)*(b+1)*(len-a)*(len-b));
            }
        }
        return ans;
    }
}
