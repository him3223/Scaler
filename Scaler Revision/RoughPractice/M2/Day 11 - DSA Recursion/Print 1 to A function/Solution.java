public class Solution {
	public static void Solve(int A) {
		if (A==0) return;
		System.out.print(A+" ");
		Solve(A-1);
		System.out.print(A+" ");
	}
	public static void main(String[] args) {
		int A = 10;
		Solve(A);
	}
}