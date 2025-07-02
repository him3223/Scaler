import java.util.Arrays;
public class Solution2 {
    public static int[] solve(int[] A) {
        int len = A.length;
        int min = A[0];
        int max = A[0];
        int num = 0;
        for (int a=0; a<len; a++) {
            num = A[a];
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int range = max-min+1;
        int [] count = new int[range];
        System.out.println("min: "+min+", max: "+max);
        System.out.println("range: "+range);
        for (int a=0; a<len; a++) {
            num = A[a];
            count[num-min]++;
        }
        System.out.println("count"+Arrays.toString(count));
        int index = 0;
        for (int a=0; a<range; a++) {
            while (count[a]-- > 0) {
                A[index++]=a+min;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int A[] = {3,9,7,2,4};
        System.out.println(Arrays.toString(solve(A)));
    }
}
