public class Solution {
	public static int solve(int A) {
		if (A<=1) {
			return A;
		}
		return A*solve(A-1);
	}
	public static void main(String[] args) {
		int A = 4;
		System.out.println(solve(A));
	}
}