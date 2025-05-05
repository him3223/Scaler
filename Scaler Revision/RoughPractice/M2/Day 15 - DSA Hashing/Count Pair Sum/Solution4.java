import java.util.*;
public class Solution4 {
    public static int solve(ArrayList<Integer> A, int B) {
        int MOD = 1000000007;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int len = A.size();
        int num = 0;
        int part = 0;
        int ans = 0;
        for (int a=0; a<len; a++) {
            num = A.get(a);
            part = B-num;
            if (hm.containsKey(part)) ans+=hm.get(part);
            if (hm.containsKey(num)) hm.put(num,hm.get(num)+1);
            else hm.put(num,1);
        }
        return ans%MOD;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 1, 2));
        int B = 3;
        System.out.println(solve(A,B)); //4
    }
}