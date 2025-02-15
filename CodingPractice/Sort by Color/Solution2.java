import java.util.Arrays;
public class Solution2 {
    public static int[] sortColors(int[] A) {
        int k = 0;
        int len = A.length;
        int color[] = new int[3];
        for(int a=0; a<len; a++)
            color[A[a]]++;
        for (int b=0;b<3 ;b++ ) {
            for (int c=0; c<color[b]; c++)
                A[k++]=b;
        }
        return A;
    }
    public static void main(String[] args) {
        int A[] = {0, 1, 2, 0, 1, 2};
        System.out.println(Arrays.toString(sortColors(A)));
    }
}
