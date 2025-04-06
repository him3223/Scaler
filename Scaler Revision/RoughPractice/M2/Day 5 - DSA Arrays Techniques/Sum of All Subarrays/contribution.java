public class contribution {
	public static int totSum(int[] A) {
		int len = A.length;
		int contB = 0;
		int sum = 0;
		for (int a=0;a<len ;a++ ) {
			contB = A[a]*(a+1)*(len-a);
			sum+=contB;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] A = {1,2,3};
		System.out.println(totSum(A));
	}
}