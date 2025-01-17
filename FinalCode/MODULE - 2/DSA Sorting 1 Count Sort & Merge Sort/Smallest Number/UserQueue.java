import java.util.Stack;
public static class UserQueue {
    /** Initialize your data structure here. */
    UserQueue() {
        Stack<Integer> main = new Stack<Integer>();
        Stack<Integer> aux = new Stack<Integer>();
    }
    
    /** Push element X to the back of queue. */
    static void push(int X) {
        main.push(X);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        int x=0;
        if (empty())
            return -1;
        if (aux.isEmpty()) {
            while (!main.isEmpty()) {
                x = main.peek();
                main.pop();
                aux.push(x);
            }
        }
        aux.pop();       
    }
    
    /** Get the front element of the queue. */
    static int peek() {
        int x=0;
        if (empty())
            return -1;
        if (aux.isEmpty()) {
            while (!main.isEmpty()) {
                x = main.peek();
                main.pop();
                aux.push(x);
            }
        }
        return aux.peek();
    }
    
    /** Returns whether the queue is empty. */
    static boolean empty() {
        return (main.isEmpty() && aux.isEmpty());
    }
}