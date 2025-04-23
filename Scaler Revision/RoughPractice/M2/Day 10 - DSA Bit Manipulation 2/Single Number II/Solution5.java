// every element appears thrice except for one, which occurs once
public class Solution5 {
    public static int singleNumber(final int[] A) {
    	int len = A.length;
    	int count = 0;
    	int ans = 0;
    	for (int a=0; a<32; a++) {
    		count = 0;
    		for (int b=0; b<len; b++) {
    			if ((A[b] & (1<<a)) != 0) {
    				count ++;
    			}
    		}
    		if (count%3==1)
    			ans = ans|(1<<a);
    	}
    	return ans;
    }
	public static void main(String[] args) {
		int[] A = {0, 0, 0, 1};
		System.out.println(singleNumber(A));
	}
}