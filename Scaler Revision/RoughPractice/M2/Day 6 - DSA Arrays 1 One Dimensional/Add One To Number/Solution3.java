import java.util.Arrays;
public class Solution3 {
    public static int[] plusOne(int[] A) {
        int len = A.length;
        int start = 0;
        int sum =0;
        while (start<len && A[start]==0) start++;
        int trimlen = len-start;
        int[] trimmed = new int[trimlen];
        System.arraycopy(A,start,trimmed,0,trimlen);
        int carray = 1;
        for (int a=trimlen-1; a>-1; a--) {
            if (carray==0) break;
            sum = trimmed[a]+carray;
            trimmed[a]=sum%10;
            carray=sum/10;
        }
        if (carray>0) {
            int[] result = new int[trimlen+1];
            result[0]=carray;
            System.arraycopy(trimmed,0,result,1,(trimlen+1));
            return result;
        }
        return trimmed;
    }
    public static void main(String[] args) {
        int[] A = {0, 0, 1, 2, 3};
        System.out.println(Arrays.toString(plusOne(A)));
    }
}