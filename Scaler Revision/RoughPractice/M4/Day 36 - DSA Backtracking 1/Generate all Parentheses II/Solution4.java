import java.util.ArrayList;

public class Solution4 {
    ArrayList<String> ans = new ArrayList<>();
    public ArrayList<String> generateParenthesis(int A) {
        getPara("",A,0,0);
        return ans;
    }
    public void getPara(String str, int A, int open, int close) {
        if (str.length()==2*A) {
            ans.add(str);
            return;
        }
        if (open<A) getPara(str+'(',A,open+1,close);
        if (open>close) getPara(str+')',A,open,close+1);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int A = 4; // Change this value to test different inputs
        ArrayList<String> result = obj.generateParenthesis(A);

        System.out.println("Balanced parentheses combinations for A = " + A + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
