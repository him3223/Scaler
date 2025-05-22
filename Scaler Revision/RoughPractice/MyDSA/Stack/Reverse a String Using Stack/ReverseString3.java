import java.util.Stack;

public class ReverseString3 {
    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch: str.toCharArray()) {
            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Red"));  // Output: "olleh"
    }
}
