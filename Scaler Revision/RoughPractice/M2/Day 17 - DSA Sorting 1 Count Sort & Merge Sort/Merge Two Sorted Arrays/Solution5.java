import java.util.*;
public class Solution5 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> AA = new ArrayList<Integer>(A);
        ArrayList<Integer> BB = new ArrayList<Integer>(B);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int alen = AA.size();
        int blen = BB.size();
        while (alen>0 && blen>0) {
            if (AA.get(0)<=BB.get(0)) {
                ans.add(AA.get(0));
                AA.remove(0);
                alen--;
            }
            if (alen>0) {
                if (BB.get(0)<AA.get(0)) {
                    ans.add(BB.get(0));
                    BB.remove(0);
                    blen--;
                }
            }
        }
        ans.addAll(AA);
        ans.addAll(BB);
        return ans;
    }
    public static void main(String[] args) {

        // List<Integer> listA = Arrays.asList(4, 7, 9);
        // List<Integer> listB = Arrays.asList(2, 11, 19);


        List<Integer> listA = Arrays.asList(3,9,23,45);
        List<Integer> listB = Arrays.asList(2,27,49,100);

        ArrayList<Integer> result = solve(listA, listB);

        // Print the result
        System.out.println("Result: " + result);
    }
}
