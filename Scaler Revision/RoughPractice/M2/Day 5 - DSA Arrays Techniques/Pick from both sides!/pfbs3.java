public class pfbs3 {
	public static int solve(int[] A, int B) {
		int len = A.length;
		int[] prefixfront = new int[B+1];
		int[] prefixback = new int[B+1];
		int sum = Integer.MIN_VALUE;
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
		int[] A = {5,-2,3,1,2};
		int B = 3;
		System.out.println(solve(A,B));
	}
}