public class bita {
	public static void main(String[] args) {
		System.out.println(countbit(9));
	}
	public static int countbit(int A) {
		int count=0;
		while (A>0) {
			count += (A&1);
			A>>=1;
		}
		return count;
	}
}