public class Solution3 {
	public static int solve(int A) {
		if (A<=1) return A;
		return A*solve(A-1);
	}
	public static void main(String[] args) {
		int A = 5;
		System.out.println(solve(A));
	}
}