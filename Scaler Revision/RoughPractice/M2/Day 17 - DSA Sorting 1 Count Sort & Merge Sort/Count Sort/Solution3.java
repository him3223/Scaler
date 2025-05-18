import java.util.*;
public class Solution3 {
    public static int[] solve(int[] A) {
        int len = A.length;
        int max = A[0];
        int min = A[0];
        int num = 0;
        int index = 0;
        int range = 0;
        for (int a=0; a<len; a++) {
            num = A[a];
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        range = max-min+1;
        int count[] = new int[range];
        for (int a=0; a<len; a++) {
            num = A[a];
            count[num-min]++;
        }
        for (int a=0; a<range; a++) {
            while (count[a]-- > 0) {
                A[index++]=a+min;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 1, 3, 9};
        System.out.println(Arrays.toString(solve(A)));
    }
}
