import java.util.Stack;

public class Solution {
    public int solve(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                // If stack is empty or top of stack doesn't match, return 0
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), ch)) {
                    return 0;
                }
                stack.pop(); // Pop the matching opening bracket
            }
        }

        // If the stack is empty, all brackets are balanced
        return stack.isEmpty() ? 1 : 0;
    }

    // Helper function to check if a pair of brackets match
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
