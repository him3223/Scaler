public class pfrombs {
	public static int solve (int[] A) {
		int len = A.length;
		int leftsum = 0;
		int totsum = 0;
		for (int a=0;a<len ;a++ ) {
			totsum+=A[a];
		}
		for (int a=0; a<len; a++) {
			if (leftsum==totsum-leftsum-A[a])
				return a;
			leftsum+=A[a];
		}
		return leftsum;
	}
	public static void main(String[] args) {
		int[] A = {-7,1,5,2,-4,3,0};
		System.out.println(solve(A));
	}
}