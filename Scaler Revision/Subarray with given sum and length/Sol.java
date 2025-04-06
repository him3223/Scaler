public class Sol {
	public static int sol(int[] A, int B, int C) {
		int len = A.length;
		int sum = 0;
		int[] prefix = new int[len];
		prefix[0]=A[0];
		for (int a=1;a<len ;a++ ) {
			prefix[a]=prefix[a-1]+A[a];
		}
		for (int b=B; b<len; b++) {
			sum = prefix[b]-(b-B >= 0 ? prefix[b-B]:0);
			if (sum==C) return 1;
		}
		return 0; 
	}
	public static void main(String[] args) {
		int[] A = {4,2,2,5,1};
		int B = 2;
		int C = 6;
		System.out.println(sol(A,B,C));
	}
}