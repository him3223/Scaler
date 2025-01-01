import java.util.HashSet;
public class Solution2 {
    public static int solve(int[] A) {
        int prefixsum = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = A.length;
        for (int a=0;a<len ;a++ ) {
            prefixsum+=A[a];
            if(prefixsum==0 || hs.contains(prefixsum))
                return 1;
            hs.add(prefixsum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {4,2,-3,1};
        int[] B = {1,2,3,4,5};
        System.out.println(solve(B));
    }
}
