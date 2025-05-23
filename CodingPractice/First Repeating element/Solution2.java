import java.util.HashMap;
public class Solution2 {
    public static int solve(int[] A) {
        int len = A.length;
        int freq = 0;
        int hmsize =0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int a=0;a<len ;a++ ) {
            if (hm.containsKey(A[a]))
                hm.put(A[a],hm.get(A[a])+1);
            else
                hm.put(A[a],1);
        }
        for (int a=0;a<len;a++ ) {
            freq=hm.get(A[a]);
            if (freq>1)
                return A[a];
        }
        return -1;
    }
    public static void main(String[] args) {
        int A[] = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
}
