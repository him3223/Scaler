import java.util.HashMap;
import java.util.Arrays;
public class Solution2 {
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
            if (hm.containsKey(A[b])) ans[b]=hm.get(B[b]);
            else ans[b]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1, 2};
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
