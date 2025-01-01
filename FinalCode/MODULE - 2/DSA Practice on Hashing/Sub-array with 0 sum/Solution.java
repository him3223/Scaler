import java.util.HashSet;
public class Solution {
    public static int solve(int[] A) {
        int len = A.length;
        int partSum =0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int a=0;a<len ;a++ ) {
            partSum+=A[a];
            if (partSum==0 || hs.contains(partSum))
                return 1;
            hs.add(partSum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {4,2,-3,1};
        int[] B = {1,2,3,4,5};
        System.out.println(solve(A));
    }
}
