import java.util.Arrays;
public class Solution3 {
    public static int[] solve(int A, int[][] B) {
        int len = B.length;
        int startindex = 0;
        int endindex = 0;
        int val = 0;
        int[] ans = new int[A];
        for (int a=0; a<len; a++) {
            startindex=B[a][0]-1;
            endindex=B[a][1]-1;
            val=B[a][2];
            ans[startindex]+=val;
            if(endindex!=A-1) {
                ans[endindex+1]+=(-val);
            } 
        }
        for (int a=1; a<A; a++) {
            ans[a]+=ans[a-1];
        }
        return ans;
    }
    public static void main(String[] args) {
    	int A = 5;
    	int[][] B = {{1,2,10},{2,3,20},{2,5,25}};
    	System.out.println("ans final: "+Arrays.toString(solve(A,B)));
    }
}
