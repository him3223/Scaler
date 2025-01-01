import java.util.HashMap;
public class Solution {
    public static int solve(int[] A, int B) {
        int len = A.length;
        int ans =0;
        int sum =0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,1);
        for (int a=0;a<len ;a++ ) {
            sum+=A[a];
            if (hm.containsKey(sum-B))
                ans+=hm.get(sum-B);
            if (hm.containsKey(sum))
                hm.put(sum,hm.get(sum)+1);
            else
                hm.put(sum,1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {5,0,5,0,5};
        int B = 5;
        System.out.println(solve(A,B));
    }
}
