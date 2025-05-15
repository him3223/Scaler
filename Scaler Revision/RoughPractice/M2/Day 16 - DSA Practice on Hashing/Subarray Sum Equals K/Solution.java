import java.util.*;
public class Solution {
    public static int solve(int[] A, int B) {
        int len = A.length;
        int sum = 0;
        int ans = 0;
        int part = 0;
        HashMap <Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for (int a=0; a<len; a++) {
            sum+=A[a];
            part = sum-B;
            if (hm.containsKey(part))
                ans+=hm.get(part);
            if (hm.containsKey(sum))
                hm.put(sum,hm.get(sum)+1);
            else
                hm.put(sum,1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1,0,1};
        int B = 1;
        System.out.println(solve(A,B));
    }
}
