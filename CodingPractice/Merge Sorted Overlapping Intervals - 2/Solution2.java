import java.util.ArrayList;
import java.util.Arrays;
public class Solution2 {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int len = A.size();
        ArrayList<Integer> L = A.get(0);
        ArrayList<Integer> R = null;
        for (int a=1; a<len; a++) {
            R=A.get(a);
            if (L.get(1)>=R.get(0)) {
                L.set(1,Math.max(R.get(1),L.get(1)));
            }
            else {
                ans.add(L);
                L=R;
            }
        }
        ans.add(L);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A =  new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,3)));
        A.add(new ArrayList<>(Arrays.asList(2,6)));
        A.add(new ArrayList<>(Arrays.asList(8,10)));
        A.add(new ArrayList<>(Arrays.asList(15,18)));
        System.out.println(solve(A));
    }
}
