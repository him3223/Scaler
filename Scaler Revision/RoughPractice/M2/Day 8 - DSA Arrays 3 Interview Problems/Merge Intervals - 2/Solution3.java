import java.util.*;
public class Solution3 {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int len = A.size();
        int a = 0;
        while (a<len && A.get(a).get(1) < B.get(0)) {
            ans.add(A.get(a));
            a++;
        }
        while (a<len && A.get(a).get(0) < B.get(1)) {
            B.set(0,Math.min(A.get(a).get(0),B.get(0)));
            B.set(1,Math.min(A.get(a).get(1),B.get(1)));
            a++;
        }
        ans.add(B);
        while (a<len) {
            ans.add(A.get(a));
            a++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Input: [[1, 3], [6, 9]]
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<Integer>() {{ add(1); add(3); }});
        intervals.add(new ArrayList<Integer>() {{ add(6); add(9); }});

        // New interval: [2, 5]
        ArrayList<Integer> newInterval = new ArrayList<>();
        newInterval.add(2);
        newInterval.add(5);

        ArrayList<ArrayList<Integer>> result = sol.insert(intervals, newInterval);

        // Print result
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print("[" + result.get(i).get(0) + ", " + result.get(i).get(1) + "]");
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

