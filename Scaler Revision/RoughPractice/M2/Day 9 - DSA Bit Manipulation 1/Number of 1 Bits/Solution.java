public class Solution {
	public static int noOfBit(int num) {
		int ans =0;
		while (num!=0) {
			ans += (num &1);
			num >>=1;
		}
		return ans;
	}
	public static void main(String[] args) {
		int num = 11;
		System.out.println(noOfBit(num));
	}
}