public class Solution {
	public static int solve(int[] A, int B) {
		int[] freq = new int[B];
		int len = A.length;
		int ans =0;
		int r1=0;
		int r2 =0;
		for (int a=0; a<len; a++) {
			r1 = A[a]%B;
			r2 = B-r1;
			if (r1==0) {
				r2=r1;
			}
			ans+=freq[r2];
			freq[r1]++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		int B = 2;
		System.out.println(solve(A,B));
	}
}