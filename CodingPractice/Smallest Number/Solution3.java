import java.util.Arrays;
public class Solution3 {
    public static int[] smallestNumber(int[] A) {
        int len = A.length;
        int c=0;
        int dig[] = new int[10];
        for (int a=0;a<len ;a++ ) {
            dig[A[a]]++;
        }
        for(int a=0; a<10; a++) {
            for (int b=0;b<dig[a] ;b++ ) {
                A[c++]=a;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int A[] = {6,3,4,2,7,2,1};
        System.out.println(Arrays.toString(smallestNumber(A)));
    }
}
