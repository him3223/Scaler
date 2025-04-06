public class bit {
	public static void main(String[] args) {
		bit b = new bit();
		System.out.println(b.countbit(3));
	}
	public int countbit(int A) {
		int count=0;
		while(A>0) {
			count+=(A&1);
			A >>= 1;
		}
		return count;
	}
}