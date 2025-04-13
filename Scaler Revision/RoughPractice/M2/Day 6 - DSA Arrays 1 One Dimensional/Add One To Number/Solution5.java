import java.util.Arrays;
public class Solution5 {
    public static int[] plusOne(int[] A) {
        int len = A.length;
        int start = 0;
        int sum =0;
        while (start<len && A[start]==0) start++;
        int trimlen = len - start;
        if (start==len) return new int[]{1};
        int[] trimmed = new int[trimlen];
        System.arraycopy(A,start,trimmed,0,trimlen);
        int carry = 1;
        for (int a=trimlen-1; a>-1; a--) {
            if (carry==0) break;
            sum = trimmed[a]+carry;
            trimmed[a]=sum%10;
            carry=sum/10;
        }
        if (carry>0) {
            int[] result = new int[trimlen+1];
            result[0]=carry;
            System.arraycopy(trimmed,0,result,1,trimlen);
            return result;
        }
        return trimmed;
    }
    public static void main(String[] args) {
        int[] A = {0,0,0,9,9,9};
        System.out.println(Arrays.toString(plusOne(A)));
    }
}