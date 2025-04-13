import java.util.*;
public class Solution5 {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int len = A.size();
        ArrayList<Integer> L = A.get(0);
        ArrayList<Integer> R;
        for (int a=0; a<len; a++) {
            R = A.get(a);
            if (L.get(1) >= R.get(0)) {
                L.set(1, Math.max(L.get(1),R.get(1)));
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
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(2, 10)));
        A.add(new ArrayList<>(Arrays.asList(4, 9)));
        A.add(new ArrayList<>(Arrays.asList(6, 7)));
        // A.add(new ArrayList<>(Arrays.asList(15, 18)));

        ArrayList<ArrayList<Integer>> result = solve(A);
        for (ArrayList<Integer> interval : result) {
            System.out.println(interval);
        }
    }
}