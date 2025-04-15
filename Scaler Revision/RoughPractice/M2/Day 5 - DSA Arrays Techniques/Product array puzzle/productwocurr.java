// product of all element expect current element
import java.util.Arrays;
public class productwocurr {
	public static int[] solve(int[] A) {
		int len = A.length;
		int prod = 1;
		int[] ans = new int[len];
		for (int a=0;a<len;a++ ) {
			prod *= A[a];
		}
		for (int a=0;a<len ;a++ ) {
			ans[a]=prod/A[a];
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solve(A)));
	}
}