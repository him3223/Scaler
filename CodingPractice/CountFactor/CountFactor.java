public class CountFactor {
	public static void main(String args[]) {
		int count = 0;
		int num = 100;
		int sqrt = (int)Math.sqrt(num);
		for (int a=1; a<=sqrt; a++) {
			if (num%a==0) {
				if (a!=num/a) {
					count++;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}