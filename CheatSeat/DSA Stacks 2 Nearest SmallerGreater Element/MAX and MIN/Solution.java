import java.util.Stack;

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int MOD = 1000000007;

        // Arrays to store the contribution of each element
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        // Compute leftMax and rightMax using monotonic stack
        Stack<Integer> stack = new Stack<>();
        
        // For leftMax
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            leftMax[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // For rightMax
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            rightMax[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        stack.clear();

        // Compute leftMin and rightMin using monotonic stack
        // For leftMin
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                stack.pop();
            }
            leftMin[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // For rightMin
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            rightMin[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Calculate the result
        long result = 0;

        for (int i = 0; i < n; i++) {
            long maxContribution = (long) A[i] * leftMax[i] * rightMax[i];
            long minContribution = (long) A[i] * leftMin[i] * rightMin[i];
            result = (result + (maxContribution - minContribution + MOD) % MOD) % MOD;
        }

        return (int) result;
    }
}
