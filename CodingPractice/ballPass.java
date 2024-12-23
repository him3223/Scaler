import java.util.Stack;
public class ballPass {
    public static int solve(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>(); // To track the ball possession history
        stack.push(B); // Initially, player B has the ball

        for (int i = 0; i < A; i++) {
            if (C[i] == 0) {
                // Back Pass: Revert to the previous possessor of the ball
                stack.pop();
            } else {
                // Forward Pass: Pass the ball to the player with id C[i]
                stack.push(C[i]);
            }
        }

        // The player at the top of the stack currently possesses the ball
        return stack.peek();
    }
    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int[] C = {83,63,60,0,47,0,99,9,0,0};
        System.out.println(solve(A,B,C));
    }
}
