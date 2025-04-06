public class sumOfSubArray {
	public static void main(String[] args) {
		int[] A = {1,2,3};
		System.out.println(totSum(A));
	}
	public static int totSum(int[] A) {
		int len = A.length;
		int contribution =0;
		int sum =0;
		for (int a=0;a<len;a++) {
			contribution=A[a]*(a+1)*(len-a);
			sum+=contribution;
		}
		return sum;
	}
}