import java.util.*;
public class Solution4 {
    static ArrayList<Integer> ans = new ArrayList<Integer>();
    public static ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        getindex(A,A.size()-1,B,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void getindex(ArrayList<Integer> A, int e, int B, ArrayList<Integer> ans) {
        if (e==-1) return;
        getindex(A,e-1,B,ans);
        if (A.get(e)==B) ans.add(e);
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int B = 1;
        System.out.println(allIndices(A,B));
    }
}
