public class bitta {
	public static void main(String[] args) {
		System.out.println(bitcount(7));
	}
	public static int bitcount(int A) {
		int count=0;
		while (A>0) {
			count +=(A&1);
			A>>=1;
		}
		return count;
	}
}