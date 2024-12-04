public class CountFactor3 {
	public static void main(String[] args) {
		int num = 10;
		int count = 0;
		int sqrt = (int)Math.sqrt(num);
		for (int a=1; a<=sqrt; a++) {
			if (num%a==0) {
				if (a!=num/a) {
					count++;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}