public class pfbs5 {
	public static int solve(int[] A, int B) {
		int len = A.length;
		int sum = Integer.MIN_VALUE;
		int[] prefixfront = new int[B+1];
		int[] prefixback = new int[B+1];
		for (int a=0;a<B ;a++ ) {
			prefixfront[a+1]=prefixfront[a]+A[a];
			prefixback[a+1]=prefixback[a]+A[len-1-a];
		}
		for (int a=0; a<=B; a++) {
			sum=Math.max(sum,prefixfront[a]+prefixback[B-a]);
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] A = {2, 3, -1, 4, 2, 1};
		int B = 4;
		System.out.println(solve(A,B));
	}
}