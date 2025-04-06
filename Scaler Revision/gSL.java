public class gSL {
	public static void main(String[] args) {
		int[] A = {4,3,2,6,1};
		int B = 4;
		int C = 15;
		System.out.println(sum(A,B,C));
	}
	public static int sum(int[] A, int B, int C) {
		int len = A.length;
		int[] prefix = new int[len];
		prefix[0]=A[0];
		int sum = 0;
		for (int a=1;a<len;a++ ) {
			prefix[a]=prefix[a-1]+A[a];
		}
		for (int b=B-1;b<len ;b++ ) {
			sum = prefix[b] - (b-B >= 0 ? prefix[b-B]:0);
			if (sum==C){
				return 1;
			}
		}
		return 0;
	}
}