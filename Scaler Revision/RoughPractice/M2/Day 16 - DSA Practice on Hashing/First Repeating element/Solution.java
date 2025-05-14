import java.util.*;
public class Solution {
    public static int solve(int[] A) {
        int len = A.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int a=0; a<len; a++) {
            if (hm.containsKey(A[a])) {
                hm.put(A[a],(hm.get(A[a]))+1);
            }
            else{
                hm.put(A[a],1);
            }
        }
        int hmsize = hm.size();
        for (int a=0; a<hmsize; a++){
            int freq = hm.get(A[a]);
            if (freq>1){
                return A[a];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};   // 5
        System.out.println(solve());
    }
}
