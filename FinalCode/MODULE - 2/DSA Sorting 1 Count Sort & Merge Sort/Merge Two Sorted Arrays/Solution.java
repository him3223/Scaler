import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> solve(final ArrayList<Integer> A, final ArrayList<Integer> B) {
        ArrayList<Integer> AA = new ArrayList<Integer>(A);
        ArrayList<Integer> BB = new ArrayList<Integer>(B);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int Alen = AA.size();
        int Blen = BB.size();
        while (Alen>0 && Blen>0) {
            if (AA.get(0)<BB.get(0)) {
                ans.add(AA.get(0));
                AA.remove(0);
                Alen--;
            }
            if (Alen>0) {
                if (BB.get(0)<AA.get(0)) {
                    ans.add(BB.get(0));
                    BB.remove(0);
                    Blen--;
                }
            }
        }
        ans.addAll(AA);
        ans.addAll(BB);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 7, 9));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 11, 19));
    	System.out.println(solve(A,B));
    }
}
