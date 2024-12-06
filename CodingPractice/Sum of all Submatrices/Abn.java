public class Abn {
    public static void main(String[] args) {
        // Input matrix
        int[][] A = {
            {3, 2, 6},
            {4, 5, 9},
            {8, 7, 2}
        };
        
        int n = A.length; // Dimension of the matrix
        System.out.println("Sum of all submatrices: " + calculateSubmatrixSum(A, n));
    }
    
    public static long calculateSubmatrixSum(int[][] A, int n) {
        long totalSum = 0;
        
        // Traverse each element in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the contribution of A[i][j]
                long topLeft = (long) (i + 1) * (j + 1);       // Ways to pick top-left corners
                long bottomRight = (long) (n - i) * (n - j);  // Ways to pick bottom-right corners
                
                long contribution = A[i][j] * topLeft * bottomRight;
                totalSum += contribution;
            }
        }
        
        return totalSum;
    }
}
