import java.util.Arrays;
public class Solution {
    public static long[] rangeSum(int[] A, int[][] B) {
        int alen = A.length;
        int blen = B.length;
        long[] result = new long[blen];
        int[] prefix = new int[alen+1];
        for (int a=0; a<alen; a++) {
            prefix[a+1]=prefix[a]+A[a];
        }
        for (int a=0; a<blen; a++) {
            int l = B[a][0];
            int r = B[a][1];
            result[a]=prefix[r+1]-prefix[l];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[][] B = {{1,3}};
        System.out.println(Arrays.toString(rangeSum(A,B)));
    }
}