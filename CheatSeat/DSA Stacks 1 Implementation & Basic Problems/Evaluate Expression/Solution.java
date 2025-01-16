import java.util.Stack;
public class Solution {
    public int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();
        int len = A.length;
        int num2=0;
        int num1=0;
        for (int a=0; a<len; a++) {
            if (isNumber(A[a])) {
                stack.push(Integer.parseInt(A[a]));
            }
            else {
                num2=stack.peek();
                stack.pop();
                num1=stack.peek();
                stack.pop();
                stack.push(calc(num1,A[a],num2));
            }
        }
        return stack.peek();
    }
    public int calc(int num1, String exp, int num2) {
        switch(exp) {
            case "+": return num1+num2;
            case "-": return num1-num2;
            case "*": return num1*num2;
            case "/": return num1/num2;
        }
        return 0;
    }
    public boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
