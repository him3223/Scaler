import java.util.Arrays;
public class Solution {
    public static int[] solve(int A, int[][] B) {
	        int blen = B.length;
	        int strindex = 0;
	        int endindex = 0;
	        int val = 0;
	        int ans[] = new int[A];
	        for (int a=0; a<blen; a++) {
		            strindex = B[a][0]-1;
		            endindex = B[a][1]-1;
		            val = B[a][2];
	                ans[strindex]+=val;
	                System.out.println("ans first up: "+Arrays.toString(ans));
	                if (endindex!=A-1) {
	                	ans[endindex+1]+=(-val);
	                	System.out.println("ans first down: "+Arrays.toString(ans));
	                }
	        }
            for (int b=1; b<A; b++) {
                ans[b]+=ans[b-1];
	            System.out.println("ans second: "+Arrays.toString(ans));
            }
	        return ans;
    }
    public static void main(String[] args) {
    	int A = 5;
    	int[][] B = {{1,2,10},{2,3,20},{2,5,25}};
    	System.out.println("ans final: "+Arrays.toString(solve(A,B)));
    }
}
