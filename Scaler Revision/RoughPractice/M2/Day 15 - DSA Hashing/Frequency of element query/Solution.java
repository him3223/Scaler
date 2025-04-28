import java.util.HashMap;
import java.util.Arrays;
public class Solution {
    public static int[] solve(int[] A, int[] B) {
        int Alen = A.length;
        int Blen = B.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] ans = new int[Blen];
        for (int a=0; a<Alen; a++) {
            if (hm.containsKey(A[a]))
                hm.put(A[a],hm.get(A[a])+1);
            else
                hm.put(A[a],1);
        }
        for (int a=0; a<Blen; a++) {
            if (hm.containsKey(B[a]))
                ans[a]=hm.get(B[a]);
            else
                ans[a]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1};
        int[] B = {1, 2};
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
