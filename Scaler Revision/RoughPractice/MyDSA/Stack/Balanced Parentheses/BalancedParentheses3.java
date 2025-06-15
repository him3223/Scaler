import java.util.Stack;

public class BalancedParentheses3 {
    public static boolean isBalanced(String expr) {
        Stack<Character> st = new Stack<>();
        for (char ch: expr.toCharArray()) {
            if (ch=='(' || ch=='{' || ch=='[') {
                st.add(ch);
            }
            else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((ch==')' && top != '(')
                    || (ch=='}' && top != '{')
                    || (ch==']' && top != '[')
                ) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("([)]"));   // false
    }
}
