public class pickfbs {
	public static int solve(int[] A) {
		int len = A.length;
		int totsum = 0;
		int leftsum = 0;
		for (int a=0;a<len ;a++ ) {
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
		int[] A = {8,7,6,12,6,7,8};
		System.out.println(solve(A));
	}
}