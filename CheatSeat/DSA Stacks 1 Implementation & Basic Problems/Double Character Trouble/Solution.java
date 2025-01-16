import java.util.Stack;
public class Solution {
    Stack<Character> stack = new Stack<>();
    public String solve(String A) {
        int len = A.length();
        char ch;
        for (int a=0; a<len; a++) {
            ch = A.charAt(a);
            if (!stack.isEmpty() && stack.peek()==ch)
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.peek());
            stack.pop();
        }
        return ans.reverse().toString();
    }
}
