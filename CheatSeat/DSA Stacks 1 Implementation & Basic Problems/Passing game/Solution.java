import java.util.Stack;
public class Solution {
    public int solve(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();
        stack.push(B);
        for (int a=0; a<A; a++) {
            if (C[a]!=0)
                stack.push(C[a]);
            else
                stack.pop();
        }
        return stack.peek();
    }
}
