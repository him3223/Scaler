import java.util.HashMap;
import java.util.Arrays;
public class Solution5 {
    public static int[] solve(int[] A, int[] B) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int alen = A.length;
        int blen = B.length;
        int[] ans = new int[blen];
        for (int a=0; a<alen; a++) {
            if (hm.containsKey(A[a])) hm.put(A[a],hm.get(A[a])+1);
            else hm.put(A[a],1);
        }
        for(int b=0; b<blen; b++) {
            if (hm.containsKey(B[b])) ans[b]=hm.get(B[b]);
            else ans[b]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 5, 9, 2, 8};
        int[] B = {3, 2};
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
