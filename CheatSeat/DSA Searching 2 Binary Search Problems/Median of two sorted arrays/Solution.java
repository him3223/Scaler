public class Solution {
    public int solve(int[] A, int[] B) {
        // Make sure A is the smaller array for efficiency
        if (A.length > B.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }
        
        int M = A.length;
        int N = B.length;
        int low = 0;
        int high = M;
        int median = 0;
        
        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (M + N + 1) / 2 - partitionA;  // +1 for the case of odd total length
            
            // Handle edge cases for partitioning
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == M) ? Integer.MAX_VALUE : A[partitionA];
            
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == N) ? Integer.MAX_VALUE : B[partitionB];
            
            // Correct partition is found
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((M + N) % 2 == 0) {
                    // Even total length: take average of the two middle values
                    median = Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB);
                    return (int) Math.floor(median / 2.0);  // Round down by casting to int
                } else {
                    // Odd total length: take the max of the left partition
                    median = Math.max(maxLeftA, maxLeftB);
                    return median;
                }
            } else if (maxLeftA > minRightB) {
                // Move the partition in A to the left
                high = partitionA - 1;
            } else {
                // Move the partition in A to the right
                low = partitionA + 1;
            }
        }
        
        // If no solution, this is a fallback case; shouldn't reach here for valid input
        return -1;
    }
}
