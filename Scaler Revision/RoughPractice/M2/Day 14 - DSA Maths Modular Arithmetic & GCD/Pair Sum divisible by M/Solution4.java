public class Solution4 {
	public static int solve(int[] A, int B) {
		int len = A.length;
		int[] freq = new int[B];
		int r1 = 0;
		int r2 =0;
		int ans = 0;
		for (int a=0; a<len; a++) {
			r1 = A[a]%B;
			r2 = B-r1;
			if (r1==0) r2=0;
			ans+=freq[r2];
			freq[r1]++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] A = {5, 17, 100, 11};
		int B = 28;
		System.out.println(solve(A,B));
	}
}