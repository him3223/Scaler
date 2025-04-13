import java.util.Arrays;
public class Solution1 {
    public static int[] plusOne(int[] A) {
        int len = A.length;
        int start = 0;
        int sum = 0;
        while(start<len && A[start]==0) {
            start++;
        }

        if (start == len) return new int[]{1};
        int[] trimmed = new int[len-start];
        System.arraycopy(A,start,trimmed,0,len-start);
        int carry =1;
        for (int a=trimmed.length-1; a>-1; a--) {
            if (carry==0) break;
            sum=trimmed[a]+carry;
            trimmed[a]=sum%10;
            carry=sum/10;
        }
        if (carry>0) {
            int result[] = new int[trimmed.length+1];
            result[0]=carry;
            System.arraycopy(trimmed,0,result,1,trimmed.length);
            return result;
        }
        return trimmed;
    }
    public static void main(String[] args) {
        int[] A = {0, 0, 1, 2, 3};
        System.out.println(Arrays.toString(plusOne(A)));
    }
}