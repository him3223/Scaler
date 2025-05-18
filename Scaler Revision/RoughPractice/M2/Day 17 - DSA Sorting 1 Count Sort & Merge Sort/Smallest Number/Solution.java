import java.util.Arrays;
public class Solution {
    public static int[] smallestNumber(int[] A) {
        int d=0;
        int[] dig = new int[10];
        int len = A.length;
        for (int a=0; a<len; a++)
            dig[A[a]]++;
        for (int b=0; b<10; b++) {
            for (int c=0; c<dig[b]; c++)
                A[d++]=b;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {6, 3, 4, 2, 7, 2, 1};
        System.out.println(Arrays.toString(smallestNumber(A)));
    }
}
