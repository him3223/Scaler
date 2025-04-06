public class fact {
	public static void main(String[] args) {
		System.out.println(countfactorial(100));
	}
	public static int countfactorial(int A) {
		int sqrt = (int)Math.sqrt(A);
		int count =0;
		for (int a=1;a<=sqrt;a++ ) {
			if (A%a==0) {
				if(A/a==a) count++;
				else count+=2;
			}
		}
		return count;
	}
}