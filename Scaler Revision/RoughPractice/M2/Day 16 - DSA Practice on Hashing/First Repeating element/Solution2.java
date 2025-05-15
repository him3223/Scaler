import java.util.*;
public class Solution2 {
    public static int solve(int[] A) {
        int len = A.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int num = 0;
        for (int a=0; a<len; a++) {
            num = A[a];
            if (hm.containsKey(num)) hm.put(num,hm.get(num)+1);
            else hm.put(num,1);
        }
        int hmsize = hm.size();
        for (int a=0; a<hmsize; a++) {
            if (hm.get(A[a])>1) return A[a];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};   // 5
        System.out.println(solve(A));
    }
}
