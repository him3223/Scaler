import java.util.*;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> AA = new ArrayList<Integer>(A);
        ArrayList<Integer> BB = new ArrayList<Integer>(B);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int Alen = AA.size();
        int Blen = BB.size();
        while (Alen>0 && Blen>0) {
            if (AA.get(0)<=BB.get(0)) {
                ans.add(AA.get(0));
                AA.remove(0);
                Alen--;
            }
            if (Alen>0) {
                if (BB.get(0)<=AA.get(0)) {
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
        List<Integer> listA = Arrays.asList(4, 7, 9);
        List<Integer> listB = Arrays.asList(2, 11, 19);

        ArrayList<Integer> result = solve(listA, listB);

        // Print the result
        System.out.println("Result: " + result);
    }
}
