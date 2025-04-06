public class Solution {
	public static void main(String[] args) {
		int[] A = {4,7,2,6,1};
		int B = 3;
		int C = 9;
		System.out.println(solve(A,B,C));
	}
	public static int solve(int[] A, int B, int C) {
		int len = A.length;
		int sum = 0;
		int prefix[] = new int[len];
		prefix[0]=A[0];
		for (int a=1;a<len ;a++ ) {
			prefix[a]=prefix[a-1]+A[a];
		}
		for (int a=B-1;a<len ;a++ ) {
			sum = prefix[a]-(a-B >=0 ? prefix[a-B]:0);
			if (sum==C) return 1;
		}
		return 0;
	}
}