public class pfbswrong {
	public static int solve(int[] A) {
		int len = A.length;
		int leftsum = 0;
		int totsum = 0;
		for (int a=0; a<len; a++) {
			totsum+=A[a];
		}
		for (int a=0;a<len ;a++ ) {
			if (leftsum == totsum - leftsum - A[a]) {
				return a;
			}
			leftsum+=A[a];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] A = {-5,7,4,3,-9,5,2};
		int[] B = {7,3,2,12,-9,2,3,7,12};
		int[] C = {3,2,5,2,3};
		System.out.println(solve(A));
	}
}