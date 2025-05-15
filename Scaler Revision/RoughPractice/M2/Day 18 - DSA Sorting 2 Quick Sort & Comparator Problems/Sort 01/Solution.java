import java.util.Arrays;
public class Solution {
    public static int[] sort01(int[] A) {
        int len = A.length;
        int countzero = 0;
        for (int a=0; a<len; a++) {
            if (A[a]==0) {
                countzero++;
            }
        }
        for (int a=0; a<len; a++) {
            if (a<countzero) A[a]=0;
            else A[a]=1;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1,0};
        System.out.println(Arrays.toString(sort01(A)));
    }
}
