public class totSum {
	public static int sumofSubArray(int[] A) {
		int contribution = 0;
		int sum = 0;
		int len = A.length;
		for (int a=0;a<len;a++) {
			contribution = A[a] * (a+1) * (len-a);
			sum+=contribution;
		}
		return sum;
	} 
	public static void main(String[] args) {
		int[] A = {1,2,3};
		System.out.println(sumofSubArray(A));
	}
}