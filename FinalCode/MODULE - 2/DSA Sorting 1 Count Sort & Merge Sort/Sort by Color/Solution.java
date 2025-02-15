import java.util.Arrays;
public class Solution {
    public static int[] sortColors(int[] A) {
        int n = 0;
        int len = A.length;
        int[] color = new int[3];
        for (int a=0;a<len ;a++ )
            color[A[a]]++;
        for (int a=0; a<3; a++) {
            for(int b=0; b<color[a]; b++)
                A[n++]=a;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 0, 1, 2};
        System.out.println(Arrays.toString(sortColors(A)));
    }
}
