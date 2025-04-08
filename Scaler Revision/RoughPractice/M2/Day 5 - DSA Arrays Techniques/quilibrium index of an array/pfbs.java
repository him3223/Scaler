public class pfbs {
	public static int solve (int[] A) {
		int len = A.length;
		int totsum = 0;
		int leftsum = 0;
		for (int a=0;a<len ;a++ ) {
			totsum+=A[a];
		}
		for (int a=0; a<len; a++) {
			if (leftsum == totsum - leftsum -A[a]) return a;
			leftsum+=A[a];
		}
		return leftsum;
	}
	public static void main(String[] args) {
		int[] A = {1,2,5,2,1};
		System.out.println(solve(A));
	}
}