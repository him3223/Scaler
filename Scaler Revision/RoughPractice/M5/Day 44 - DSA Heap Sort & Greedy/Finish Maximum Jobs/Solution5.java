import java.util.Arrays;

public class Solution5 {
    public int solve(int[] A, int[] B) {
        int len = A.length;
        int[][] jobs = new int[len][2];
        for (int a=0; a<len; a++) {
            jobs[a][0]=A[a];
            jobs[a][1]=B[a];
        }
        Arrays.sort(jobs,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int lastfinishtime = 0;
        for (int a=0; a<len; a++) {
            if (jobs[a][1]>lastfinishtime) {
                count++;
                lastfinishtime=jobs[a][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 3, 0, 5, 8, 5};
        int[] B = {2, 4, 6, 7, 9, 9};

        int result = sol.solve(A, B);
        System.out.println("Maximum number of jobs that can be done: " + result);
    }
}
