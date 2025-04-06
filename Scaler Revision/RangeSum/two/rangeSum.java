import java.util.Arrays;
public class rangeSum {
	public static int[] rSum(int A[], int B[][]) {
		int alen = A.length;
		int blen = B.length;
		int[] prefix = new int[alen+1];
		int[] result = new int[blen];
		for (int a=0;a<alen ;a++ ) {
			prefix[a+1]=prefix[a]+A[a];
		}
		for (int b=0; b<blen; b++) {
			int l = B[b][0];
			int r = B[b][1];
			result[b]=prefix[r+1]-prefix[l];
		}
		return result;
	}
	public static void main(String[] args) {
		int A[] = {1,2,3,4,5};
		int B[][] = {{0,3},{1,2}};
		System.out.println(Arrays.toString(rSum(A,B)));
	}
}