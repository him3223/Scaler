import java.util.Stack;
public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack();
        int len = A.length;
        int[] ans = new int[len];
        Arrays.fill(ans, -1);
        for (int a=0; a<len; a++) {
            while (!stack.isEmpty() && stack.peek()>=A[a]) {
                stack.pop();
            }
            if (!stack.isEmpty())
            ans[a]=stack.peek();
            stack.push(A[a]);
        }
        return ans;
    }
}
