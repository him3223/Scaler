import java.util.Arrays;

public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A); // Ensure the stalls are sorted
        int len = A.length;
        int ans = 0;
        int l = 1; // Minimum possible distance
        int r = A[len - 1] - A[0]; // Maximum possible distance

        while (l <= r) {
            int mid = l + (r - l) / 2; // Midpoint to test
            if (isPossiblePlaceCows(A, len, mid, B)) {
                ans = mid; // Update the answer
                l = mid + 1; // Try for a larger distance
            } else {
                r = mid - 1; // Reduce the distance
            }
        }
        return ans;
    }

    private boolean isPossiblePlaceCows(int[] A, int len, int mid, int B) {
        int count = 1; // Place the first cow
        int lastPlaced = A[0]; // Position of the last placed cow

        for (int i = 1; i < len; i++) {
            if (A[i] - lastPlaced >= mid) { // Check if current stall can accommodate a cow
                count++;
                lastPlaced = A[i];
                if (count == B) { // All cows are placed
                    return true;
                }
            }
        }
        return false; // Not all cows can be placed
    }
}
