import java.util.HashMap;
public class Solution3 {
    public static int solve(int[] A) {
        int len = A.length;
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int a=0;a<len;a++ ) {
            if (hm.containsKey(A[a]))
                hm.put(A[a],hm.get(A[a])+1);
            else
                hm.put(A[a],1);
        }
        int hmsize = hm.size();
        for (int a=0;a<hmsize ;a++ ) {
            if (hm.get(A[a])>1)
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int A[] = {10, 5, 3, 4, 3, 5, 6};
        int B[] = {1,2,3,4,5};
        System.out.println(solve(B));
    }
}
