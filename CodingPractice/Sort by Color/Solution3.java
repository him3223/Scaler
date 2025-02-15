import java.util.Arrays;
public class Solution3 {
    public static int[] sortColors(int[] A) {
        int len = A.length;
        int s=0;
        int[] color = new int[3];
        for (int a=0;a<len ;a++ ) {
            color[A[a]]++;
        }
        for (int b=0;b<3 ;b++ ) {
            for(int c=0; c<color[b];c++ )
                A[s++]=b;
        }
        return A;
    }
    public static void main(String[] args) {
        int A[] = {2,0,0,1,1};
        System.out.println(Arrays.toString(sortColors(A)));
    }
}
