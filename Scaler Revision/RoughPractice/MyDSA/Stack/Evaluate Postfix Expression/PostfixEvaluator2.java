import java.util.Stack;

public class PostfixEvaluator2 {
    public static int evaluate(String expr) {
        Stack<Integer> st = new Stack<Integer>();
        int a=0;
        int b=0;
        for (char ch: expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                st.push(ch-'0');
            }
            else {
                b=st.pop();
                a=st.pop();
                switch(ch) {
                    case '+': st.push(a+b); break;
                    case '-': st.push(a-b); break;
                    case '*': st.push(a*b); break;
                    case '/': st.push(a/b); break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("231*+9-"));  // Output: -4
    }
}
