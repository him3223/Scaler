import java.util.Arrays;
public class RangeSum {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int len = A.length;
		int[] prefix = new int[len];
		prefix[0]=A[0];
		for (int a=0; a<len-1; a++) {
			prefix[a+1]=prefix[a]+A[a+1];
		}
		System.out.println(Arrays.toString(prefix));
		int[] range = {0,3};
		int rlrn = range.length;
		int L = range[0];
		int R = range[1];
		int result = prefix[R]-prefix[L];
		System.out.println(result);
	}
}