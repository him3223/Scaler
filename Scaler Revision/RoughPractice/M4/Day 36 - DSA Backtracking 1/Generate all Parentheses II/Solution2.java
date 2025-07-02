import java.util.ArrayList;

public class Solution2 {
    ArrayList<String> ans = new ArrayList<>();
    public ArrayList<String> generateParenthesis(int A) {
        genPara("",A,0,0);
        return ans;
    }
    public void genPara(String str, int A, int open, int close) {
        if (str.length()==2*A) {
            ans.add(str);
            return;
        }
        if (open<A) {
            genPara(str+'(',A,open+1,close);
        }
        if (open>close) {
            genPara(str+')',A,open,close+1);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int A = 3; // Change this value to test different inputs
        ArrayList<String> result = obj.generateParenthesis(A);

        System.out.println("Balanced parentheses combinations for A = " + A + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
