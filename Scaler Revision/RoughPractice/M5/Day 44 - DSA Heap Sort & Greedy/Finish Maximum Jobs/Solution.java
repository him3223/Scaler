import java.util.Arrays;

public class Solution {
    public int solve(int[] A, int[] B) {
        int n = A.length;
        int[][] jobs = new int[n][2];

        // Store jobs with their start and finish times
        for (int i = 0; i < n; i++) {
            jobs[i][0] = A[i];  // Start time
            jobs[i][1] = B[i];  // Finish time
        }

        // Sort jobs by finish time (Greedy Strategy)
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastFinishTime = 0;

        for (int i = 0; i < n; i++) {
            if (jobs[i][0] >= lastFinishTime) {
                count++;  // Select this job
                lastFinishTime = jobs[i][1];  // Update last finish time
            }
        }

        return count;  // Maximum jobs that can be done
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 3, 0, 5, 8, 5};
        int[] B = {2, 4, 6, 7, 9, 9};

        int result = sol.solve(A, B);
        System.out.println("Maximum number of jobs that can be done: " + result);
    }
}
