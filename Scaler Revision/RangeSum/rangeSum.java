import java.util.Arrays;
public class rangeSum {
	public static int[] rSum(int[] A, int[][] B) {
		int alen = A.length;
		int blen = B.length;
		int prefix[] = new int[alen+1];
		int result[] = new int[blen];
		for (int i=0; i<alen; i++) {
			prefix[i+1]=prefix[i]+A[i];
		}
		for (int a=0; a<blen; a++) {
			int l = B[a][0];
			int r = B[a][1];
			result[a]=prefix[r+1]-prefix[l];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] A={1,2,3,4,5};
		int[][] B={{0,3},{1,2}};
		System.out.println(Arrays.toString(rSum(A,B)));
	}
}