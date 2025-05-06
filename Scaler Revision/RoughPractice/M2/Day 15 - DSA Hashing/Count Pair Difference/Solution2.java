import java.util.*;
public class Solution2 {
    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int len = A.size();
        int MOD = 1000000007;
        int num = 0;
        int part = 0;
        int part2 = 0;
        int ans = 0;
        for (int a=0; a<len; a++) {
            num = A.get(a);
            part = B+num;
            part2 = num-B;
            if (hm.containsKey(part))
                ans+=hm.get(part);
            if (hm.containsKey(part2))
                ans+=hm.get(part2);
            if (hm.containsKey(num))
                hm.put(num,hm.get(num)+1);
            else
                hm.put(num,1);
        }
        return ans%MOD;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 1, 2));
        int B = 1;
        System.out.println(solve(A,B));
    }
}
