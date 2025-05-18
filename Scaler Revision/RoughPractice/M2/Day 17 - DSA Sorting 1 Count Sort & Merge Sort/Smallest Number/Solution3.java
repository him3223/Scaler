import java.util.Arrays;
public class Solution3 {
    public static int[] smallestNumber(int[] A) {
        int len = A.length;
        int d=0;
        int[] digit = new int[10];
        for (int a=0; a<len; a++)
            digit[A[a]]++;
        for (int b=0; b<10; b++) {
            for (int c=0; c<digit[b]; c++)
                A[d++]=b;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {6, 3, 4, 2, 7, 2, 1};
        System.out.println(Arrays.toString(smallestNumber(A)));
    }
}
